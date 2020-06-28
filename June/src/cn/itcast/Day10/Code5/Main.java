package cn.itcast.Day10.Code5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println(sdf.format(d));
        System.out.println("-----------------");
        String sj="2020-01-01";
        SimpleDateFormat sdf2=new SimpleDateFormat("y-m-d");
        Date d2=sdf2.parse(sj);
        System.out.println(d2);
    }
}
