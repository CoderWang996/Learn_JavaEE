package cn.itcast.Day10.Code4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());
        long Time=1000*60*60;
        d.setTime(Time);
        System.out.println(d);
    }
}
