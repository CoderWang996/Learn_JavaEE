package cn.itcast.Day10.DateUtil;

import java.text.ParseException;
import java.util.Date;

/*
    测试类
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        String s1 = DateUtil.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtil.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtil.dateToString(d, "HH:mm:ss");
        System.out.println(s3);
        System.out.println("--------");

        String s = "2048-08-09 12:12:12";
        Date dd = DateUtil.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}