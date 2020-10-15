package com.itheima.springboot_mybatis.controller;

import com.itheima.springboot_mybatis.domain.User;
import com.itheima.springboot_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user")
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
