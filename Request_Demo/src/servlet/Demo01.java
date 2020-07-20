package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Demo01")
public class Demo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取虚拟目录名称
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //获取Servlet映射路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        //获取访问者IP
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
        //获取请求消息的数据
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //获取统一资源标识符URI
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        //获取统一资源定位符URL
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
