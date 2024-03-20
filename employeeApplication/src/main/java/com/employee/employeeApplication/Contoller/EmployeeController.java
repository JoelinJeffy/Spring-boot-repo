package com.employee.employeeApplication.Contoller;

import com.employee.employeeApplication.Entity.EmployeeEntity;
import com.employee.employeeApplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class EmployeeController {
    EmployeeService employeeService;

    @Autowired
    public EmployeeController (EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/addStudents")
    public String addStudents(@RequestBody EmployeeEntity employeeEntity)
    {
        employeeService.addEmployee(employeeEntity);
        return "Successfully added";

    }
    @PutMapping("/update/{id}")
    public EmployeeEntity updateStudent(@PathVariable int id,@RequestBody EmployeeEntity employeeEntity)
    {
        EmployeeEntity employee=employeeService.updateEmployee(id,employeeEntity);
        return employee;
    }

}
