package com.example.demo.service;

import com.example.demo.entity.Class;
import com.example.demo.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {
    @Autowired
    private ClassMapper classMapper;

    public Class getClassByID(Integer classID) {
        return classMapper.findClassByID(classID);
    }
}