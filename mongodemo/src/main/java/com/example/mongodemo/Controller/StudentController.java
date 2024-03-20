package com.example.mongodemo.Controller;

import com.example.mongodemo.Entity.Student;
import com.example.mongodemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    StudentRepository studentRepository;
    @Autowired
    public StudentController(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    @GetMapping("/getStudents")
    public List<Student> getStudent()
    {
        return studentRepository.findAll();
    }
}
