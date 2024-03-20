package com.example.graphqldemo.StudentController;

import com.example.graphqldemo.Model.Department;
import com.example.graphqldemo.Model.Student;
import com.example.graphqldemo.Repsitory.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

@Controller
public class DepartmentController {
    DepartmentRepository departmentRepository;
    @Autowired
    public DepartmentController (DepartmentRepository departmentRepository)
    {
        this.departmentRepository=departmentRepository;
    }
    @QueryMapping("getAllDepartment")
    public List<Department> getAllDepartments()
    {
        return departmentRepository.findAll();
    }
    @QueryMapping("getDepartmentById")
    public Department getDepartmentById(@Argument int id)
    {
        return departmentRepository.findById(id).orElse(null);
    }
    @MutationMapping
    public Department createDepartment(@Argument String name,@Argument int numberOfStudents)
    {
        return departmentRepository.save(new Department(name,numberOfStudents));
    }
    @MutationMapping
    public String updateDepartment(@Argument String name,@Argument int numberOfStudents)
    {
        Department department=new Department();
        department.setName(name);
        department.setNumberOfStudents(numberOfStudents);
        departmentRepository.save(department);
        return "Updated successfully";
    }

    @QueryMapping
    public List<Student> getStudentsByDepartment(@Argument String name) {
        Department department = departmentRepository.findByName(name);
        if (department != null) {
            return department.getStudents(); // Assuming getStudents() method returns a list of students for the department
        } else {
            return Collections.emptyList();
        }
    }

}
