package com.example.demo.mapper;

import com.example.demo.entity.Class;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClassMapper {
    @Select("SELECT * FROM class WHERE classID = #{classID}")
    Class findClassByID(@Param("classID") Integer classID);
}