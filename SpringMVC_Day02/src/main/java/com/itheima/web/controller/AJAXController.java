package com.itheima.web.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AJAXController {
    @RequestMapping("/ajaxController")
    public String ajaxController(@RequestBody String message) {
        System.out.println("异步请求String类型数据：" + message);
        return "page";
    }

    @RequestMapping("/ajaxPojoToController")
    public String ajaxPojoToController(@RequestBody User user) {
        System.out.println("异步请求pojo类型数据：" + user);
        return "page";
    }

    @RequestMapping("/ajaxListToController")
    public String ajaxListToController(@RequestBody List<User> list) {
        System.out.println("异步请求List类型数据：" + list);
        return "page";
    }

    @RequestMapping("/ajaxReturnString")
    @ResponseBody
    public String ajaxReturnString() {
        System.out.println("异步返回String类型数据：");
        return "page";
    }

    @RequestMapping("/ajaxReturnJson")
    @ResponseBody
    public User ajaxReturnJson() {
        System.out.println("异步返回json POJO类型数据：");
        User user = new User();
        user.setName("Tom");
        user.setAge(5);
        return user;
    }

    @RequestMapping("/ajaxReturnJsonList")
    @ResponseBody
    public List ajaxReturnJsonList() {
        System.out.println("controller return json list...");
        User user1 = new User();
        user1.setName("Tom");
        user1.setAge(3);

        User user2 = new User();
        user2.setName("Jerry");
        user2.setAge(5);

        ArrayList al = new ArrayList();
        al.add(user1);
        al.add(user2);
        return al;
    }
}
