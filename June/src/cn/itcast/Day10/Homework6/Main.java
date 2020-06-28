package cn.itcast.Day10.Homework6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
【编号：1306】某共公司产品经理要求App需要有3款主题样式，用户选择不同的主题，
展示时间的格式也要有不同的风格，请编写代码实现该功能。 运行结果：
请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
1
主题切换成功,当前时间为：2018年12月10日

请选择主题：1.xxxx年xx月xx日，2.yyyy-MM-dd，3.yyyy/MM/dd
4
很抱歉，操作有误，已为您切换默认主题
主题切换成功,当前时间为：2018年12月10日
 */
class DateUtil{
    private DateUtil(){}
    public static String DateToString(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s=sdf.format(date);
        return  s;
    }
    public static Date StingToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date d=sdf.parse(s);
        return d;
    }
}
public class Main {
    public static void main(String[] args) {
        Date d=new Date();
        String s1=DateUtil.DateToString(d,"yyyy年MM月dd日");
        String s2=DateUtil.DateToString(d,"yyyy-MM-dd");
        String s3=DateUtil.DateToString(d,"yyyy/MM/dd");
        Scanner cin=new Scanner(System.in);
        System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
        switch (cin.nextInt()){
            case 1:
                System.out.println("主题切换成功,当前时间为："+s1);
                System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
                break;
            case 2:
                System.out.println("主题切换成功,当前时间为："+s2);
                System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
                break;
            case 3:
                System.out.println("主题切换成功,当前时间为："+s3);
                System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
                break;
            default:
                System.out.println("很抱歉，操作有误，已为您切换默认主题");
                System.out.println("主题切换成功,当前时间为："+s1);
        }
    }
}
