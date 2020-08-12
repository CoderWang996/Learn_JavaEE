package com.itheima.controller;

import com.itheima.domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/UserServlet/*")
public class UserServlet extends BaseServlet{
    //用户登录
    private void login(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        //获取页面数据
        BufferedReader reader = req.getReader();
        //将流对象转成user对象
        User u = gson.fromJson(reader,User.class);
        System.out.println(u);
        User user = userService.findUser(u);
        if (user!=null){
            resp.getWriter().write("true");
        }else{
            resp.getWriter().write("false");
        }
    }
}
