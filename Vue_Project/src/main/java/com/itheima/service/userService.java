package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

//持久层接口
public interface userService {
    //查找所有
    List<User> findAll();
    //新增功能
    void save(User user);
    //根据id删除
    void deleteByIds(String ids);
    //根据id查找
    User findById(Integer id);
    //修改
    void update(User user);
}
