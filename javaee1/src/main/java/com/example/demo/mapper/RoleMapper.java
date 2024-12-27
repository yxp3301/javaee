package com.example.demo.mapper;

import com.example.demo.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RoleMapper {
    @Select("SELECT * FROM role WHERE roleID = #{roleID}")
    Role findRoleByID(@Param("roleID") Integer roleID);
}