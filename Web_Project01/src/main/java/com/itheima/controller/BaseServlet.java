package com.itheima.controller;
import com.itheima.service.iml.userServiceiml;
import com.itheima.service.userService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
//抽取Servlet
public class BaseServlet extends HttpServlet {
    public userService userService;
    @Override
    public void init() throws ServletException {
        userService=new userServiceiml();
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
