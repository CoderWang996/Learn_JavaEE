import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Test1")
public class Test1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求中的三个路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        String realPath = req.getServletContext().getRealPath("/WEB-INF/classes/Test1");
        System.out.println(realPath);
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
        System.out.println("------------------------------");
        //获取访问者IP
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
        System.out.println("-----------------------------");
        //获取指定头信息Referer,User-Agent,并打印
        String referer = req.getHeader("Referer");
        System.out.println(referer);
        System.out.println("-----------------------------");
        Enumeration<String> headers = req.getHeaders("User-Agent");
        while (headers.hasMoreElements()){
            String s = headers.nextElement();
            System.out.println(s);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
