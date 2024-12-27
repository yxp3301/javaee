package com.example.demo.mapper;

import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeacherMapper {
    @Select("SELECT * FROM teacher WHERE teacherID = #{teacherID}")
    Teacher findTeacherByID(@Param("teacherID") Integer teacherID);
}