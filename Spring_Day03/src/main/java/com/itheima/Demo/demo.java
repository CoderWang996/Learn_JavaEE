package com.itheima.Demo;

import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        UserService userService = ac.getBean(UserService.class);
        userService.save();
//        userService.update(1);
    }
}
