package com.itheima.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/StudentServlet/*")
public class StudentServlet extends BaseServlet {
    //分页查询
    private void selectByPage(HttpServletRequest req, HttpServletResponse resp){
        //获取页面数据
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        //调用业务层查询方法
        Page page = service.selectByPage(Integer.parseInt(currentPage),Integer.parseInt(pageSize));
        //封装pageInfo
        PageInfo info = new PageInfo(page);
        //将info转成json，响应给客户端
        try {
            String json = mapper.writeValueAsString(info);
            resp.getWriter().write(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //添加功能
    private void addStu(HttpServletRequest req,HttpServletResponse resp){
        //获取页面数据
        String number = req.getParameter("number");
        String name = req.getParameter("name");
        String birthday = req.getParameter("birthday");
        String address = req.getParameter("address");
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        Student student = new Student(number, name, birthday, address);
        //调用service层的addStu方法
        service.addStu(student);
        //重定向到分页查询功能
        try {
            resp.sendRedirect(req.getContextPath()+"/StudentServlet/selectByPage?currentPage="+
                    currentPage+"&pageSize="+pageSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //修改功能
    private void update(HttpServletRequest req,HttpServletResponse resp){
        //获取页面数据
        String number = req.getParameter("number");
        String name = req.getParameter("name");
        String birthday = req.getParameter("birthday");
        String address = req.getParameter("address");
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        Student stu = new Student(number, name, birthday, address);
        //调用service层的update方法
        service.update(stu);
        //重定向到分页查询功能
        try {
            resp.sendRedirect(req.getContextPath()+"/StudentServlet/selectByPage?currentPage="+
                    currentPage+"&pageSize="+pageSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //删除功能
    private void deleteStu(HttpServletRequest req,HttpServletResponse resp){
        //获取页面数据
        String number = req.getParameter("number");
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        //调用service层的deleteStu方法
        service.deleteStu(number);
        //重定向到分页查询功能
        try {
            resp.sendRedirect(req.getContextPath()+"/StudentServlet/selectByPage?currentPage="+
                    currentPage+"&pageSize="+pageSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
