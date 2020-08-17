package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.service.store.CompanyService;
import com.itheima.service.store.CompanyServiceImpl;
import com.itheima.service.system.dept.DeptService;
import com.itheima.service.system.dept.DeptServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

//抽取Servlet
public class BaseServlet extends HttpServlet {

    //初始化数据，只加载一次
    public ObjectMapper objectMapper;
    public CompanyService companyService;
    public DeptService deptService;
    @Override
    public void init() throws ServletException {
        companyService=new CompanyServiceImpl();
        deptService = new DeptServiceImpl();
        objectMapper = new ObjectMapper();
    }

    //根据url执行方法
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的URL
        StringBuffer url = req.getRequestURL();
        //截取URL获取方法名
        String methodName = url.substring(url.lastIndexOf("/") + 1);

        try {
            //获取方法对象
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
