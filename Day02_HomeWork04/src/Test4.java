import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
public class Test4 extends HttpServlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.输出ServletConfig
        System.out.println(config);
        //2.获取Servlet的名称
        String name = config.getServletName();
        System.out.println("Servlet的名称为："+name);
        //3.获取字符集编码
        String first = config.getInitParameter("first");
        System.out.println("first对应的内容为："+first);
        //4.获取所有初始化参数名称的枚举
        Enumeration<String> names = config.getInitParameterNames();
        while (names.hasMoreElements()){
            String n = names.nextElement();
            String v = config.getInitParameter(n);
            System.out.println(n+"=="+v);
        }
        //5.获取ServletContext对象
        ServletContext context = config.getServletContext();
        System.out.println(context);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
