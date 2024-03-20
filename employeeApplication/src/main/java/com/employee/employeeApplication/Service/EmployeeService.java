package com.employee.employeeApplication.Service;

import com.employee.employeeApplication.Entity.EmployeeEntity;
import com.employee.employeeApplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository=employeeRepository;
    }
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity)
    {
      return   employeeRepository.save(employeeEntity);

    }
    public EmployeeEntity updateEmployee(int id,EmployeeEntity employeeEntity)
    {
        EmployeeEntity employee=employeeRepository.findById(id).get();
        employee.setEmployeeName(employeeEntity.getEmployeeName());
        employee.setEmployeeRole(employeeEntity.getEmployeeRole());
        employee.setSalary(employeeEntity.getSalary());
        employeeRepository.save(employee);
        return employee;


    }

}
