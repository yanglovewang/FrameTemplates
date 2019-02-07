package com.yang.springboottest.server;

import com.yang.springboottest.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserServer {

    User findUser(@Param("user") User user);
}
