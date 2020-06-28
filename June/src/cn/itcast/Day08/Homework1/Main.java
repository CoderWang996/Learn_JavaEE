package cn.itcast.Day08.Homework1;
//使用代码计算得出当前系统时间距离时间原点“1970年1月1日0时0分0秒”过了多少年，要求结果向下取整。
public class Main {
    public static void main(String[] args) {
        long n=System.currentTimeMillis();
        System.out.println(n/1000/60/60/24/365+"年");
    }
}
