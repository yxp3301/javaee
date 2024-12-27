package com.example.demo.entity;

import lombok.Data;

@Data
public class CheckTime {
    private Integer checkTimeID;
    private String startTime;
    private String endTime;
    private Integer studentCapacity;
    private Integer classID;
}