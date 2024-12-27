package com.example.demo.service;

import com.example.demo.entity.CheckInRecord;
import com.example.demo.mapper.CheckInRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInRecordService {
    @Autowired
    private CheckInRecordMapper checkInRecordMapper;

    public CheckInRecord getCheckInRecordByStudentAndCheckTime(Integer studentID, Integer checkTimeID) {
        return checkInRecordMapper.findCheckInRecordByStudentAndCheckTime(studentID, checkTimeID);
    }
}