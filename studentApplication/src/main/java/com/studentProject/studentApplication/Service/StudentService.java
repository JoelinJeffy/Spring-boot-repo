package com.studentProject.studentApplication.Service;

import com.studentProject.studentApplication.Student.StudentEntity;
import com.studentProject.studentApplication.studentDao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {
    StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    public List<StudentEntity> getAllStudents()
    {
        return studentDao.findAll();
    }
    public StudentEntity getById(int id)
    {
        return studentDao.findById(id).get();
    }
    public StudentEntity  addStudent(StudentEntity studentEntity)
    {
        return studentDao.save(studentEntity);
    }
    public StudentEntity updateStudent(int id)
    {
        StudentEntity temp=studentDao.findById(id).get();
        temp.setName("kia");
        studentDao.save(temp);
        return temp;
    }
    public StudentEntity removeStudent(int id)
    {
        StudentEntity delete=studentDao.findById(id).get();
        studentDao.delete(delete);
        return delete;
    }


}
