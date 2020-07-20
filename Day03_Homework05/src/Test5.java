import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
@WebServlet("/Test5")
public class Test5 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取图片绝对路径
        String realPath = getServletContext().getRealPath("/img/itheima.png");
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(realPath));
        resp.setHeader("Content-Type","application/octest-stream");
        resp.setHeader("Content-Disposition","attachment;filename=hm.png");
        ServletOutputStream outputStream = resp.getOutputStream();
        byte []bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            outputStream.write(bys,0,len);
        }
        bis.close();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
