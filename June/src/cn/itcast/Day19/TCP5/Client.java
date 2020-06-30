package cn.itcast.Day19.TCP5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("www.CoderWang.com",10001);
        BufferedReader br=new BufferedReader(new FileReader("June\\lienMe.txt"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        BufferedReader brClient=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data=brClient.readLine();
        System.out.println("服务器的反馈："+data);
        br.close();
        s.close();
    }
}
