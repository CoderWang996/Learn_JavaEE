package Day06.TCP.Review2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/*
客户端：数据来自于键盘录入，直到输入的数据是886,发送数据结束
服务端：接受到的数据写入文本文件中
 */
public class ClinentApp {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("www.CoderWang.com",10001);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        Scanner cin=new Scanner(System.in);
        String line;
        while ((line=cin.next())!=null){
            if (line.equals("886")){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(br2.readLine());
        s.close();
    }
}
