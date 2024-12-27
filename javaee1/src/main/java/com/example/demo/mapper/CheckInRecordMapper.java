package com.example.demo.mapper;

import com.example.demo.entity.CheckInRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CheckInRecordMapper {
    @Select("SELECT * FROM check_in_record WHERE studentID = #{studentID} AND check_timeID = #{checkTimeID}")
    CheckInRecord findCheckInRecordByStudentAndCheckTime(@Param("studentID") Integer studentID, @Param("checkTimeID") Integer checkTimeID);
}