package com.itheima.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//user/login
@WebServlet("/demo/*")
public class DemoServlet extends BaseServlet {

    private void login(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("DemoServlet login...");
    }
    private void list(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("DemoServlet list...");
    }
    private void update(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("DemoServlet update...");
    }
}
