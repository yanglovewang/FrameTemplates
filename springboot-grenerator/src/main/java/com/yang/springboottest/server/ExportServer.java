package com.yang.springboottest.server;

import com.yang.springboottest.bean.User;

import java.util.List;

public interface ExportServer {

    public List<User> listUser(User user);
}
