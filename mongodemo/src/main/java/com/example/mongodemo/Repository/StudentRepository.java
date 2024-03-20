package com.example.mongodemo.Repository;

import com.example.mongodemo.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
