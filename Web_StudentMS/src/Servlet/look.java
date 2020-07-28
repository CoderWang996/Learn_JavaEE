package Servlet;

import bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/look")
public class look extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\Student.txt"));
        ArrayList<Student> students = new ArrayList<>();
        String line;
        while ((line = bfr.readLine()) != null) {
            String[] arr = line.split(",");
            Student student = new Student(arr[0], Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3]));
            students.add(student);
        }
        bfr.close();
        req.getSession().setAttribute("students",students);
        resp.sendRedirect("/look.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
