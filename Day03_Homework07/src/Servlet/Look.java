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
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/Look")
public class Look extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\Stu.txt"));
        ArrayList<Student> list=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            String[] arr=line.split(",");
            Student student = new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
            list.add(student);
        }
        br.close();
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        for (Student student : list) {
            writer.write(student.toString());
            writer.write("<br/>");

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
