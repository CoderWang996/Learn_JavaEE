package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.itheima.service.StudentService;
import com.itheima.service.UserService;
import com.itheima.service.iml.StudentServiceIml;
import com.itheima.service.iml.UserServiceIml;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

//抽取Servlet
public class BaseServlet extends HttpServlet {
    public StudentService service;
    public UserService userService;
    public ObjectMapper mapper;
    public Gson gson;
    @Override
    public void init() throws ServletException {
        service=new StudentServiceIml();
        userService=new UserServiceIml();
        mapper=new ObjectMapper();
        gson=new Gson();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求URL
        StringBuffer url = req.getRequestURL();
        //截取URL获取方法名
        String methodName = url.substring(url.lastIndexOf("/") + 1);
        //获取方法对象
        try {
            Method method = this.getClass().getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //暴力反射
            method.setAccessible(true);
            //执行方法
            method.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
