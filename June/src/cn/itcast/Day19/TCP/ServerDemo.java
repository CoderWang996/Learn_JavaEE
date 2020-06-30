package cn.itcast.Day19.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        byte []bys=new byte[1024];
        String data=new String(bys,0,is.read(bys));
        System.out.println(data);
        ss.close();
    }
}
