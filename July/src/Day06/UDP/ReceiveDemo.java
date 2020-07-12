package Day06.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args)  throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);
        while (true){
            byte []bytes=new byte[1024];
            DatagramPacket pd=new DatagramPacket(bytes,bytes.length);
            ds.receive(pd);
            System.out.println("数据是："+new String(pd.getData(),0,pd.getLength()));
        }
    }
}
