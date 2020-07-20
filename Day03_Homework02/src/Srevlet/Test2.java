package Srevlet;

import bean.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/Test2")
public class Test2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取一个
        String name = req.getParameter("name");
        System.out.println(name);
        System.out.println("----------------------");
        //获取一个数组
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.print(hobby);
        }
        //使用工具类
        Map<String, String[]> Map = req.getParameterMap();
        Student student = new Student();
        try {
            BeanUtils.populate(student,Map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(student);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
