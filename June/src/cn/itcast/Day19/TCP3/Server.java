package cn.itcast.Day19.TCP3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10001);
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("June\\lisen.txt"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();
    }
}
