package cn.itcast.Day19.Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务器端显示：
192.168.xx.xx 说：传智播客
192.168.xx.xx 说：黑马程序员
192.168.xx.xx 说：itheima
 */
public class ServerDemo {
    public static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(10000);

        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            InetAddress localAddress = s.getLocalAddress();
            System.out.println(localAddress.getHostAddress()+line);
        }
        ss.close();
    }
}
