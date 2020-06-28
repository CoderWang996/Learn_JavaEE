package cn.itcast.Day10.Homework5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
【编号：1305】某公司想统计下员工截至到当前时间，入职公司的天数。请编写程序实现该需求，
由键盘录入员工的入职日期，格式为：xxxx年xx月xx日。将员工入职公司的天数打印到控制台。
运行结果（假设当前时间是2018年12月10日）：
请输入您入职的日期,格式为：xxxx年xx月xx日
2018年12月09日
您入职公司已经1天
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入您入职的日期,格式为：xxxx年xx月xx日");
        String s=cin.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date d=sdf.parse(s);
        long l=System.currentTimeMillis()-d.getTime();
        System.out.println("您入职公司已经"+(l/1000/60/60/24)+"天");
    }
}
