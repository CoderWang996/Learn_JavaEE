import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Test3 extends HttpServlet {
    private int Price=1000;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        uri=uri.substring(uri.lastIndexOf("/"),uri.length());
        if (uri.equals("/vip")){
            System.out.println("商品原价为："+Price+"元");
            System.out.println("vip打七折后的价格为："+(Price*0.7)+"元");
        }else if (uri.equals("/svip")){
            System.out.println("商品原价为："+Price+"元");
            System.out.println("svip打五折后的价格为："+(Price*0.5)+"元");
        }else {
            System.out.println("商品的价格为："+Price+"元");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
