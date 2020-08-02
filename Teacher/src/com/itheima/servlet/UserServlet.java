package com.itheima.servlet;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    //2、创建Service对象
   private UserService userService=new UserServiceImpl();
    private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        //获取当前页页码
        String num= req.getParameter("pageNum");
        int pageNum =1;//设置默认访问首页
        if(num!=null){
           pageNum = Integer.parseInt(num);
        }

        List<User> list=userService.findAll(pageNum);

        //交给分页处理对象进行处理：有分页信息
        PageInfo<User> pageInfo=new PageInfo<User>(list);

        //将数据存入request作用域中
        //req.setAttribute("list",list);
        req.setAttribute("pageInfo",pageInfo);
        //跳转到遍历页面
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //1、获取页面参数值
        String email = req.getParameter("email");
        String pwd = req.getParameter("password");
        User user=userService.login(email,pwd);
        //3、判断
        if(user!=null){
            req.getRequestDispatcher("/user/list").forward(req,resp);
        }else {
            req.getRequestDispatcher("/error.jsp").forward(req,resp);
        }
    }
}
