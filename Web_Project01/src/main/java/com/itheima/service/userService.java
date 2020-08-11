package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

//持久层接口
public interface userService {
    User login(String email, String password);
    //遍历所有用户
    List<User> list();
}
