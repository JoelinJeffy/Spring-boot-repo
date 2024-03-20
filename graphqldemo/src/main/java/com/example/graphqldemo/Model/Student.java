package com.example.graphqldemo.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String age;
    @Column
    private String dob;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    public Student() {
    }

    public Student(String name, String age, String dob,Department department) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.department=department;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
