package Day06.TCP.Review2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
客户端：数据来自于键盘录入，直到输入的数据是886,发送数据结束
服务端：接受到的数据写入文本文件中
 */
public class ServerApp {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10001);
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("July\\T.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw2.write("数据已保存");
        bw2.newLine();
        bw2.flush();
        bw.close();
        ss.close();
    }
}
