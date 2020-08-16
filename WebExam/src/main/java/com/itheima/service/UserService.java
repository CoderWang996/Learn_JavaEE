package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;


public interface UserService {
    //查询所有
    List<User> findAll();
    //新增
    void insert(User user);
    //修改
    void update(User user);
    //删除
    void delete(int id);
}
