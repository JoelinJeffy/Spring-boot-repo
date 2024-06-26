package com.example.classApplication;

import com.example.classApplication.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassApplication.class, args);
	}
    @GetMapping
	public List<Student>hello(){
		return List.of(
				new Student(
						1L,
						"Jeffy",
						"joejeff@gmail.com",
		LocalDate.of(2000, Month.NOVEMBER,20),
		22)
		);
	}
}
