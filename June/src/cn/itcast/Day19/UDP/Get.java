package cn.itcast.Day19.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Get {
    public static void main(String[] args) throws IOException {
        while (true){
            DatagramSocket ds=new DatagramSocket(10099);
            byte []bys=new byte[1024];
            DatagramPacket dp=new DatagramPacket(bys,bys.length);
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
        }
    }
}
