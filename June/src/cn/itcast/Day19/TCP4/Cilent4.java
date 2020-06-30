package cn.itcast.Day19.TCP4;

import java.io.*;
import java.net.Socket;

public class Cilent4 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.23.43",10010);
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