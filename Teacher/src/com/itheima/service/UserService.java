package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    //登录功能
    User login(String email, String pwd);

    List<User> findAll(int pageNum);
}
