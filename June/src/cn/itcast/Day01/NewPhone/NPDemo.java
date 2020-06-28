package cn.itcast.Day01.NewPhone;


import java.util.Scanner;

public class NPDemo {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        Phone p=new Phone();
        p.brand="一加7Pro";
        p.price=4000;
        p.neicun=128;
        p.show();
        p.call();
        p.sendMessage();
        Phone p2=new Phone();
        p2.setBrand("魅族");
        p2.setPrice(2500);
        p2.setNeicun(256);
        System.out.println(p2.getBrand()+","+p2.getPrice()+","+p2.getNeicun());
        p2.call();
        p2.sendMessage();

}
}
