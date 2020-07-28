package Servlet;

import bean.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/register")
public class register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\user.txt"));
        String line;
        while ((line=bfr.readLine())!=null){
            String []arr=line.split(",");
            if (arr[0].equals(username)){
                resp.getWriter().write("此账号已存在！两秒后自动退回注册页面。");
                resp.setHeader("Refresh","2,URL=/register.jsp");
                return;
            }
        }
        bean.user u = new user(Integer.parseInt(username), password);
        BufferedWriter bfw = new BufferedWriter(new FileWriter("D:\\user.txt",true));
        bfw.write(u.toString());
        bfw.newLine();
        bfw.close();
        resp.getWriter().write("注册成功！两秒后自动跳转到首页。");
        resp.setHeader("Refresh","2,URL=/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
