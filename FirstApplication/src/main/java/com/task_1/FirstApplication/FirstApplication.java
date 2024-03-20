package com.task_1.FirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
	@GetMapping("/")
	public List<String> hello()
	{
		System.out.println("Look at the website;)");
		return List.of("Hello"," jeffy");

	}
	@GetMapping("/sum")
	public int add()
	{
		return 2+3;
	}
	@GetMapping("/sum1")
	public int sum(@RequestParam int a,@RequestParam int b)
	{
		return a+b;
	}
	@GetMapping("/sub")
	public int sub()
	{
		return 5-3;
	}
	@GetMapping("/sub1")
	public int sub(@RequestParam int a,@RequestParam int b)
	{
		return a-b;
	}
	@GetMapping("/div")
	public int div(@RequestParam int a,@RequestParam int b)
	{
		return a/b;
	}

}
