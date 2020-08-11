package com.itheima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.itheima.domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user/*")
public class  userServlet extends BaseServlet{

    //查询所有
    private void findAll(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        List<User> list=userService.findAll();
        System.out.println(list);
        //将list转成json
        String json = mapper.writeValueAsString(list);
        //响应json数据
        resp.getWriter().write(json);
    }
    //新增功能
    private void save(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        //获取页面数据
        String userStr = req.getParameter("userStr");
        //将json数据转成对象
        User user = mapper.readValue(userStr, User.class);
        userService.save(user);
    }
    //删除功能
    private void deleteByIds(HttpServletRequest req,HttpServletResponse resp){
        //获取页面数据
        String ids = req.getParameter("ids");
        //判断字符串是否为空且长度是否为0
        if (ids!=null&&ids.length()>0){
            userService.deleteByIds(ids);
        }
    }
    //根据id查询
    private void findById(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        //获取页面数据
        String Sid = req.getParameter("id");
        //String转int
        Integer id = Integer.parseInt(Sid);
        User user = userService.findById(id);
        //将user转成json
        String json = mapper.writeValueAsString(user);
        //响应json数据
        resp.getWriter().write(json);
    }
    //修改
    private void update(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        System.out.println("来了吗");
        //获取页面数据
        String userStr = req.getParameter("u");
        //将json数据转成对象
        User user = mapper.readValue(userStr, User.class);
        userService.update(user);
    }
}
