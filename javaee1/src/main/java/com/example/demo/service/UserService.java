package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserByUsernameAndPassword(String username, String password, Integer userroleID) {
        return userMapper.findUserByUsernameAndPassword(username, password, userroleID );
    }

    // 新增注册用户的方法
    public int registerUser(int userID,String username, String password, Integer userroleID) {
        return userMapper.insertUser(userID,username, password, userroleID);
    }
    public User getUserWithMaxUserId() {
        return userMapper.findUserWithMaxUserId();
    }
}