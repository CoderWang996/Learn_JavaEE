package cn.itcast.Day19.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("192.168.23.89");
        String name=address.getHostName();
        String ip=address.getHostAddress();
        System.out.println("主机名"+name);
        System.out.println("IP地址"+ip);
    }
}
