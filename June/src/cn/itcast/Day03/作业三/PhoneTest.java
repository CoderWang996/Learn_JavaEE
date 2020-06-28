package cn.itcast.Day03.作业三;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.setBrand("小米");
        p1.setPrice(2999);
        p1.setColor("红色");
        p1.call();
        p1.sendMessage();
        Phone p2=new Phone("OnePlus",3999,"黑色");
        p2.call();
        p2.sendMessage();
    }
}
