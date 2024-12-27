package com.example.demo.service;

import com.example.demo.entity.StuClassMatch;
import com.example.demo.mapper.StuClassMatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuClassMatchService {
    @Autowired
    private StuClassMatchMapper stuClassMatchMapper;

    public StuClassMatch getStuClassMatchByStudentAndClass(Integer studentID, Integer classID) {
        return stuClassMatchMapper.findStuClassMatchByStudentAndClass(studentID, classID);
    }
}