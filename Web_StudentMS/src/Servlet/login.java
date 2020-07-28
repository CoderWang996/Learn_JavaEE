package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\user.txt"));
        String line;
        while ((line=bfr.readLine())!=null){
            String []arr=line.split(",");
            if (arr[0].equals(username)&&arr[1].equals(password)){
                req.getSession().setAttribute("username",arr[0]);
                resp.getWriter().write("登录成功，3秒后自动跳转到首页...");
                resp.setHeader("Refresh","3,URL=/index.jsp");
                return;
            }
        }
        resp.getWriter().write("登录失败，账号或密码错误！（3秒后自动跳转到首页...）");
        resp.setHeader("Refresh","3,URL=/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
