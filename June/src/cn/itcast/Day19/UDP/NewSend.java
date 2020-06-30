package cn.itcast.Day19.UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class NewSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            byte[]bys=line.getBytes();
            DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.1.66"),10086);
            ds.send(dp);
        }
        ds.close();
    }
}
