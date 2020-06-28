package cn.itcast.Day10.Homework4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
【编号：1304】请将字符串"2008-08-08"字符串，转换为日期对象，
并将转换后的对象，以及毫秒值输出在控制台
           运行结果：
           Fri Aug 08 00:00:00 CST 2008
           毫秒值为：1218124800000
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        String s = "2008-08-08";
        //----- 将字符串s转换为日期对象，并得到毫秒值.-----
        SimpleDateFormat sdf=new SimpleDateFormat("y-m-d");
        Date d=sdf.parse(s);
        System.out.println(d);
        System.out.println("毫秒值为："+d.getTime());
    }
}
