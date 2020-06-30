package cn.itcast.Day19.Homework2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
【编号2104】请编写程序，分别模拟使用TCP协议传输数据的客户端和服务器端，
客户端获取键盘录入的文本数据发送给服务器端，服务器端获取数据后，将文本数据反转，
然后反馈给客户端，客户端将反转后的数据打印到控制台。 客户端控制台显示的运行效果如下：
请输入一段文本：
hello
服务器返回：
olleh
请输入一段文本：
socket
服务器返回：
tekcos
请输入一段文本：
over
结束访问
 */
public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        while (true) {
            try {
                String line;
                line = br.readLine();
                if (line.equals("over")) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(line);
                bw.write(sb.reverse().toString());
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                break;
            }
        }
    }
}
