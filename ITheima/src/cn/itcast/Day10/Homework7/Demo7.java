package cn.itcast.Day10.Homework7;

import java.util.Calendar;

/*
【编号：1307】请使用Calendar将当前时间的年月日分别获取，
             并在控制台进行打印输出
            运行结果：
            获取到的年份为：2018
            获取到的月份为：12
            获取到的日为：10
 */
public class Demo7 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // 获取年份
        int year = c.get(Calendar.YEAR);
        /*
        	-----获取月日并输出-----
        */
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DATE);
        System.out.println("获取到的年份为："+year);
        System.out.println("获取到的月份为："+month);
        System.out.println("获取到的日为："+day);
    }
}