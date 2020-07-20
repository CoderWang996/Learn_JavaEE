package Servlet;

import bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet("/Add")
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String score = req.getParameter("score");
        Student student = new Student(username, Integer.parseInt(age), Integer.parseInt(score));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://Stu.txt",true));
        bufferedWriter.write(student.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("添加成功。两秒后将跳转到首页");
        resp.setHeader("Refresh","2,URL=/Stu/index.html");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
