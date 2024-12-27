package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM students WHERE studentID = #{studentID}")
    Student findStudentByID(@Param("studentID") Integer studentID);
}