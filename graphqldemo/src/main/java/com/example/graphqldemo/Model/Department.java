package com.example.graphqldemo.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int numberOfStudents;
    @OneToMany(mappedBy = "department")
    private List<Student> studentList;

    public Department(String name, int numberOfStudents, List<Student> studentList) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Department(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public Department() {
    }

    public List<Student> getStudents() {
        return studentList;
    }
}
