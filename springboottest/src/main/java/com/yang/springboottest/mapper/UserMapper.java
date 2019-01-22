package com.yang.springboottest.mapper;

import com.yang.springboottest.bean.User;
import org.apache.ibatis.annotations.*;

/**
 * sql 注释开发测试
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findByName(@Param("id") Integer id);

    @Select("SELECT * FROM USER WHERE id = #{user.id}")
    User findUser(@Param("user") User user);

    @Insert("INSERT INTO USER(phone) VALUES(#{phone})")
    int insert(@Param("phone") String phone);

}