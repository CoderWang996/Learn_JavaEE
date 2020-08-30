package com.itheima.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RoleController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("RoleController is running.......");
        //设置视图名称
        modelAndView.setViewName("success");
        //返回ModelAndView对象
        return modelAndView;
    }
}
