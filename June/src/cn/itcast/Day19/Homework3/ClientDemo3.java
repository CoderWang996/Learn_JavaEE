package cn.itcast.Day19.Homework3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/*
【编号2106】请编写程序，分别模拟使用TCP协议传输数据的客户端和服务器端，完成文件上传。
客户端获取键盘录入的文件路径，将文件上传给服务器端，服务器端获取到数据后，保存到当前模块目录下，
并给出反馈。其中，上传的文件仅允许jpg格式的图片，保存到服务器端的文件，为防止重名覆盖，可使用32位UUID作为文件名。
在实际生产中，服务器端有可能接收多个客户端的上传请求，所以服务器端可以使用多线程实现，为每个客户端开启一条线程完成上传。
 */
public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("www.CoderWang.com",10000);
        Scanner cin=new Scanner(System.in);
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(cin.next()));
        BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
        byte []bys=new byte[1024];
        int b;
        while ((b=bis.read(bys))!=-1){
            bos.write(bys,0,b);
            bos.flush();
        }
        s.shutdownInput();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(br.readLine());
        br.close();
        s.close();
    }
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 客户端
public class TCPClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建客户端Socket对象
        Socket socket = new Socket("127.0.0.1", 22222);
        // 获取输出流给服务器端发送数据
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        // 获取输入流读取服务器端的反馈
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // 获取键盘录入的数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一段文本：");
            String line = sc.nextLine();
            if ("over".equals(line)) {
                System.out.println("结束访问");
                break;
            }
            writer.println(line);
            // 读取反馈的数据
            String revLine = reader.readLine();
            System.out.println("服务器返回：");
            System.out.println(revLine);
        }
        // 释放资源
        socket.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 服务器端
public class TCPServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器端对象
        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("服务器启动，绑定端口22222");
        // 监听连接，接收客户端的请求
        Socket socket = serverSocket.accept();
        // 获取输入流来读取数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 获取输出流向客户端写出反馈
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        String line;
        while ((line = reader.readLine()) != null) {
            // 将获取到的数据反转，反馈给客户端
            String revLine = new StringBuilder(line).reverse().toString();
            writer.println(revLine);
        }
        // 释放资源
        serverSocket.close();
    }
}
 */