package com.example.demo.entity;

import lombok.Data;

@Data
public class CheckInRecord {
    private Integer recordID;
    private Integer studentID;
    private Integer checkTimeID;
    private Integer completionStatus;
    private Integer sequenceNumber;
    private String createdAt;
}