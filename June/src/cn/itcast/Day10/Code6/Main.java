package cn.itcast.Day10.Code6;

import java.time.Year;
import java.util.Calendar;

//Calendar日历
public class Main {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int m=c.get(Calendar.MONTH)+1;
        int d=c.get(Calendar.DATE);
        System.out.println(y+"年"+m+"月"+d+"日");
        Calendar c2=Calendar.getInstance();
        c2.set(2020,5,20);
        int y1=c2.get(Calendar.YEAR);
        int m1=c2.get(Calendar.MONTH);
        int d1=c2.get(Calendar.DATE);
        System.out.println(y1+"年"+m1+"月"+d1+"日");
        //十年后
        c2.add(Calendar.YEAR,10);
        int y2=c2.get(Calendar.YEAR);
        int m2=c2.get(Calendar.MONTH);
        int d2=c2.get(Calendar.DATE);
        System.out.println(y2+"年"+m2+"月"+d2+"日");
    }
}
