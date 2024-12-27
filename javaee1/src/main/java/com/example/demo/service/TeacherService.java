package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher getTeacherByID(Integer teacherID) {
        return teacherMapper.findTeacherByID(teacherID);
    }
}