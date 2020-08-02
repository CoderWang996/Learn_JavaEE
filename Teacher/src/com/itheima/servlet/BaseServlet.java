package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/*
* 抽取一个基础servlet
* */
public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        //获取指定的方法名称
        String methodName = uri.substring(uri.lastIndexOf("/")+1);
        try {
            //获取方法对象
            Method method=this.getClass().getDeclaredMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            //暴力反射
            method.setAccessible(true);
            method.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
