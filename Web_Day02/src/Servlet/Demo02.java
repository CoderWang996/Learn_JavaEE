package Servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Demo02 extends HttpServlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first = config.getInitParameter("first");
        System.out.println(first);
        String servletName = config.getServletName();
        System.out.println(servletName);
        Enumeration<String> names = config.getInitParameterNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();
            String values=config.getInitParameter(name);
            System.out.println(name+" "+values);
        }
        ServletContext servletContext = config.getServletContext();
        System.out.println(servletContext);
        Object username = servletContext.getAttribute("username");
        System.out.println(username);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
