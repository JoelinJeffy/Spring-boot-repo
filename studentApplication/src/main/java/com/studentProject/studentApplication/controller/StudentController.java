package com.studentProject.studentApplication.controller;

import com.studentProject.studentApplication.Service.StudentService;
import com.studentProject.studentApplication.Student.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping("/ListofStudents")
    public List<StudentEntity> getAllStudents(){
        List<StudentEntity> studentEntities= studentService.getAllStudents();
        return studentEntities;

    }
    @GetMapping("/GetById/{id}")
    public StudentEntity returnById(@PathVariable int id)
    {
        StudentEntity student=studentService.getById(id);
        return student;
    }
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody StudentEntity studentEntity)
    {

        studentService.addStudent(studentEntity);
        return "successfully added";
    }
    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@PathVariable int id)
    {
        studentService.updateStudent(id);
        return "successfully updated";
    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        studentService.removeStudent(id);
        return "successfully deleted";

    }


}
