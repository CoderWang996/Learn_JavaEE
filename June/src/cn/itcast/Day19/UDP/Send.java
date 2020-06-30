package cn.itcast.Day19.UDP;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte []bys="王牌程序员申请出战！".getBytes();
        DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.23.22"),10086);
        ds.send(dp);
        ds.close();
    }
}
