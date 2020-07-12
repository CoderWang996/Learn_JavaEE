package Day06.UDP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//案例需求
//UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
//UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine())!=null){
            if (line.equals("886")){
                break;
            }
            byte []bytes=line.getBytes();
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("www.CoderWang.com"),10086);
            ds.send(dp);
        }
        br.close();
    }
}
