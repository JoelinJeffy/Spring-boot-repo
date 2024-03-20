package com.studentProject.studentApplication.studentDao;

import com.studentProject.studentApplication.Student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentEntity, Integer> {

}
