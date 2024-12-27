package com.example.demo.entity;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String username;
    private String password;
    private Integer userroleID; // 用户角色ID
}