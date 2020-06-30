package cn.itcast.Day19.Homework1;

import java.io.*;
import java.net.Socket;

/*
客户端发送：
传智播客
黑马程序员
itheima
over
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("www.CoderWang.com",10000);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine())!=null){
            if ("over".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
