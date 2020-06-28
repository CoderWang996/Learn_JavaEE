package cn.itcast.Day02.Demo;


import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a=cin.nextInt();
        System.out.println(a);
        System.out.println("请输入一个不含空格的字符串");
        String s1=cin.next();
        System.out.println(s1);
        System.out.println("请输入一个不含回车的字符串");
        String s2=cin.nextLine();
        System.out.println(s2);
    }
}
