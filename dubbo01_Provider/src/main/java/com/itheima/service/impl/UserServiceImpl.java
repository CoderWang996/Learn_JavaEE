package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String printUserName(String name) {
        System.out.println("提供方method正在运行。。。。。");
        return name;
    }
}
