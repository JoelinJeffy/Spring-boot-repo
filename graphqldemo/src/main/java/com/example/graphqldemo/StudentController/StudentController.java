package com.example.graphqldemo.StudentController;

import com.example.graphqldemo.Model.Department;
import com.example.graphqldemo.Model.Student;
import com.example.graphqldemo.Repsitory.DepartmentRepository;
import com.example.graphqldemo.Repsitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class StudentController {
    StudentRepository studentRepository;
    @Autowired
    DepartmentRepository departmentRepository;


    @Autowired
    public StudentController(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    @QueryMapping
    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }
    @QueryMapping
    public Student getStudentById(@Argument int id)
    {
        return studentRepository.findById(id).orElse(null);
    }
    @MutationMapping
    public Student createStudent(@Argument String name,@Argument String age,@Argument String dob,@Argument String departmentName)
    {
        Department department=departmentRepository.findByName(departmentName);
        if(department==null)
        {

        }
        return studentRepository.save(new Student(name,age,dob,department));
    }
    @MutationMapping
    public String updateStudent(@Argument String name,@Argument String age,@Argument  String dob)
    {
        Student student=new Student();
        student.setAge(age);
        student.setDob(dob);
        student.setName(name);
        studentRepository.save(student);
        return "Successfully Updated";
    }



}
