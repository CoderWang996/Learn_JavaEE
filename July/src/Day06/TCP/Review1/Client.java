package Day06.TCP.Review1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
/*客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
  服务端：接收到数据在控制台输出*/
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner cin=new Scanner(System.in);
        Socket s=new Socket("www.CoderWang.com",10086);
        OutputStream os = s.getOutputStream();
        String line=cin.next();
        os.write(line.getBytes());
        InputStream is = s.getInputStream();
        byte []bytes=new byte[1024];
        int len=is.read(bytes);
        String data=new String(bytes,0,len);
        System.out.println("客户端收到的数据："+data);
        s.close();
    }
}
