package com.employee.employeeApplication.Entity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;


@Entity
@Table(name="employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String employeeName;
    @Column
    private float salary;
    @Column
    private String employeeRole;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String employeeName, float salary, String employeeRole) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeRole = employeeRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
}
