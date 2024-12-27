package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentByID(Integer studentID) {
        return studentMapper.findStudentByID(studentID);
    }
}