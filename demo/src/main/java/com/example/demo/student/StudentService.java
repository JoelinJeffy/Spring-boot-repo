package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component
public class StudentService {
    public List<Student> getStudents(){
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
