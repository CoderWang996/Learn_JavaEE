package Day06.TCP.Review1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
  服务端：接收到数据在控制台输出*/
public class Server  {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        Socket s=ss.accept();
        InputStream inputStream = s.getInputStream();
        byte []bytes=new byte[1024];
        int len=inputStream.read(bytes);
        String data=new String(bytes,0,len);
        System.out.println("服务器接到的数据："+data);
        OutputStream os = s.getOutputStream();
        os.write("服务器已收到数据。".getBytes());
        ss.close();
    }
}
