package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserServlet/*")
public class UserServlet extends BaseServlet {
    //查询所有
    public void findAll(HttpServletRequest req, HttpServletResponse resp) {
        //调用service层的findAll方法
        List<User> list = userService.findAll();
        //把查询到的list存入请求域
        req.setAttribute("list", list);
        //请求转发到User_List.jsp
        try {
            req.getRequestDispatcher("/WEB-INF/pages/User_List.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //修改
    public void xiugai(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        req.setAttribute("id",id);
        //请求转发到User_Update.jsp
        req.getRequestDispatcher("/WEB-INF/pages/User_Update.jsp").forward(req, resp);
    }
    public void update(HttpServletRequest req, HttpServletResponse resp) {
        //获取页面数据
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        //创建user对象
        User user = new User(Integer.parseInt(id), username, email);
        //调用service层的update方法
        userService.update(user);
        //调用自己的findAll
        findAll(req, resp);
    }

    //新增
    public void inset(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取页面数据
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        //创建user对象
        User user = new User(null, username, email);
        //调用service层insert
        userService.insert(user);
        //调用自己的findAll
        findAll(req, resp);
    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //请求转发到User_Add.jsp
        req.getRequestDispatcher("/WEB-INF/pages/User_Add.jsp").forward(req, resp);
    }

    //删除
    //新增
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取页面数据
        String Uid = req.getParameter("id");
        //将String类型的id转换成int类型的id
        int id=Integer.parseInt(Uid);
        //调用service层delete
        userService.delete(id);
        //调用自己的findAll
        findAll(req, resp);
    }
}
