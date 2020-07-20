package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
@WebServlet("/Demo02")
public class Demo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //根据请求头名称获取一个值
        String header = req.getHeader("accept-encoding");
        System.out.println(header);
        System.out.println("===================================");
        //根据请求头获取多个参数
        Enumeration<String> headers = req.getHeaders("connection");
        while (headers.hasMoreElements()){
            String s = headers.nextElement();
            System.out.println(s);
        }
        System.out.println("===================================");
        //获取所有请求头信息
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
