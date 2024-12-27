package com.example.demo.service;

import com.example.demo.entity.CheckTime;
import com.example.demo.mapper.CheckTimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckTimeService {
    @Autowired
    private CheckTimeMapper checkTimeMapper;

    public CheckTime getCheckTimeByID(Integer checkTimeID) {
        return checkTimeMapper.findCheckTimeByID(checkTimeID);
    }
}