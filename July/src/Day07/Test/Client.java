package Day07.Test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/*
需求：编写客户端和服务器端程序，客户端用于上传图片，服务器端用于接收文件,
文件上传成功后，给客户端一个反馈：文件上传成功。

 */
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        Socket s = new Socket("www.CoderWang.com", 10001);
        System.out.println("请输入上传文件的路径：");
        while (true) {
            String fName = cin.next();
            File f = new File(fName);
            if (f.exists() && fName.endsWith(".jpg")) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fName));
                BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
                byte[] bytes = new byte[2048];
                int len;
                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }
                s.shutdownOutput();
                BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                System.out.println("服务器的反馈："+br.readLine());
                s.close();
                bis.close();
                break;
            } else {
                System.out.println("您输入的文件路径不正确，请重新输入！");
            }
        }
    }
}

