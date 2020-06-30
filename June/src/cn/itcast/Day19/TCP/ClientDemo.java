package cn.itcast.Day19.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        //Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号
        Socket s=new Socket("192.168.23.89",10000);
        OutputStream os=s.getOutputStream();
        os.write("吃饭吃饭！".getBytes());
        s.close();
    }
}
