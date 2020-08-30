package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/update")//给当前方法定义一个请求的URL路径（二级RUL路径）
    public String update(){
        System.out.println("updating.......");
        return "success";
    }
    @RequestMapping(value = "/findAll",method = RequestMethod.GET,params = {"name=admin"})
    public String findAll(){
        System.out.println("查询所有。。。。。。");
//        return "redirect:/success.jsp";//返回视图结果  物理视图 重定向
        //return "forward:/success.jsp";//返回视图结果 物理视图 请求转发
        return "error";//返回视图结果 逻辑视图  （必须在SpringMVC核心配置文件中配置视图解析器）
    }
}
