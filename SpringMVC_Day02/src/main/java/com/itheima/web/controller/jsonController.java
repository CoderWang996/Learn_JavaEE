package com.itheima.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/json")
public class jsonController {
    //向页面响应数据
    @RequestMapping("/test")
    public String Test1() throws IOException {
        System.out.println("coming");
        return "main";
    }
    @RequestMapping("/test1")
    public void Test1(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("服务器响应数据成功。。。。。");
    }
    @RequestMapping(value = "/test2",produces = "text/html;charset=utf-8")
    @ResponseBody
    //ResponseBody可以阻止页面跳转，实现页面写入数据
    public String Test2(){
        return "Yes you are buautiful!";
    }
    @RequestMapping("/test3")
    public void Test3(HttpServletResponse response) throws IOException {
        User user = new User();
        user.setName("admin");
        user.setAge(21);
        String json = new ObjectMapper().writeValueAsString(user);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
    @RequestMapping("/test4")
    @ResponseBody
    //ResponseBody也可以将对象转换成json格式数据
    public User Test4(){
        User user = new User();
        user.setName("admin");
        user.setAge(21);
        return user;
    }
    @RequestMapping("/test5")
    @ResponseBody
    public List Test5(){
        User u1 = new User();
        User u2 = new User();
        u1.setName("oldWang");
        u1.setAge(21);
        u2.setName("oldLi");
        u2.setAge(34);
        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        return users;
    }
}
