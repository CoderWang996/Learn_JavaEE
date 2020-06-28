package cn.itcast.Day10.Homework3;
import java.util.Calendar;
/*
【编号：1303】请编写程序，获取当前系统日期，
并将结果打印到控制台，要求展示格式为：xxxx年xx月xx日 运行结果：
2088年2月15日
 */
public class Main {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int m=c.get(Calendar.MONTH)+1;
        int d=c.get(Calendar.DATE);
        System.out.println(y+"年"+m+"月"+d+"日");
    }
}