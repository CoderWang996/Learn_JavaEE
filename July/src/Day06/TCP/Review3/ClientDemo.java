package Day06.TCP.Review3;

import java.io.*;
import java.net.Socket;

/*
案例需求
客户端：数据来自于文本文件，接收服务器反馈
服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("www.CoderWang.com",10001);
        BufferedReader br=new BufferedReader(new FileReader("July\\A.txt"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        BufferedReader brC=new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(brC.readLine());
        s.close();
    }
}
