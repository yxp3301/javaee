package com.example.demo.mapper;

import com.example.demo.entity.CheckTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CheckTimeMapper {
    @Select("SELECT * FROM check_time WHERE check_timeID = #{checkTimeID}")
    CheckTime findCheckTimeByID(@Param("checkTimeID") Integer checkTimeID);
}