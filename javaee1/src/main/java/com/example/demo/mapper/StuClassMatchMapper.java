package com.example.demo.mapper;

import com.example.demo.entity.StuClassMatch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StuClassMatchMapper {
    @Select("SELECT * FROM stu_class_match WHERE studentID = #{studentID} AND classID = #{classID}")
    StuClassMatch findStuClassMatchByStudentAndClass(@Param("studentID") Integer studentID, @Param("classID") Integer classID);
}