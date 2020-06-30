package cn.itcast.Day19.TCP4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(10001);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("June\\lisen.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownInput();
        BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功！");
        bwServer.newLine();
        bwServer.flush();
        bw.close();
        ss.close();
    }
}
