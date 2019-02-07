package com.yang.springboottest.server.Impl;

import com.yang.springboottest.bean.User;
import com.yang.springboottest.mapper.UserMapper;
import com.yang.springboottest.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    UserMapper userMapper;
    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }
}
