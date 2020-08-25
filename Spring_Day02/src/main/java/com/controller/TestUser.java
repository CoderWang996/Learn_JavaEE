package com.controller;

import com.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.UserService;

import java.util.List;

public class TestUser {
    public static void main(String[] args) {
        //加载配置文件 获取IOC容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
/*        //获取代理对象
        UserMapper com.mapper = ac.getBean(UserMapper.class);
        //执行代理对象方法
        List<User> all = com.mapper.findAll();
        //输出结果
        System.out.println(all);*/
        UserService service = ac.getBean(UserService.class);
        List<User> list = service.findAll();
        System.out.println(list);
    }
}
