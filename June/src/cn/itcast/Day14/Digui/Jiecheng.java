package cn.itcast.Day14.Digui;

import java.util.Scanner;
//递归求n的阶乘
public class Jiecheng {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n=cin.nextInt();
        System.out.println(n+"的阶乘是"+Jc(n));
    }
    public static int Jc(int n){
        if(n==1){
            return 1;
        }else {
            return n*Jc(n-1);
        }
    }
}
