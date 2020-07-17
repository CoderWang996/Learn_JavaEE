import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Test06")
public class Test06 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("Stuname");
        String age=req.getParameter("age");
        String score=req.getParameter("score");
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Stu.txt",true));
        bw.write("姓名:"+name+" 年龄："+age+" 分数："+score);
        bw.newLine();
        bw.close();
        PrintWriter pw=resp.getWriter();
        pw.println("Save Success");
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
