package com.itheima.controller;

import com.itheima.domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*@WebServlet("/user/*")*/
public class  userServlet extends BaseServlet{

    //登录功能
    private void login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //获取邮箱和密码
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        //调用service方法
        User user=userService.login(email,password);
        //对user进行判断  如果邮箱和密码可以在数据库中匹配则跳转到主页面  否则跳转到登录失败页面
        if (user!=null){
            req.getRequestDispatcher("/WEB-INF/pages/main.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/WEB-INF/pages/fail.jsp").forward(req,resp);
        }
    }
    //遍历所有用户
    private void list(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //调用service方法
        List<User> users =userService.list();
        //设置请求域
        req.setAttribute("userList",users);
        //请求转发到list.jsp
        if (users.size()>0&&users!=null){
            req.getRequestDispatcher("/WEB-INF/pages/list.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/WEB-INF/pages/fail.jsp").forward(req,resp);
        }
    }
}
