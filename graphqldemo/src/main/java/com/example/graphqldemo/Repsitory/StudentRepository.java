package com.example.graphqldemo.Repsitory;

import com.example.graphqldemo.Model.Department;
import com.example.graphqldemo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
