package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE username = #{username} AND password = #{password} And userroleID = #{userroleID}")
    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password, @Param("userroleID") Integer userroleID);

    @Insert("INSERT INTO user (userID, username, password, userroleID) VALUES (#{userID}, #{username}, #{password}, #{userroleID})")// 新增注册用户的SQL语句
    int insertUser(@Param("userID") int userID,@Param("username") String username, @Param("password") String password, @Param("userroleID") Integer userroleID);
    @Select("SELECT * FROM user WHERE userId = (SELECT MAX(userId) FROM user)")
    User findUserWithMaxUserId();
}