package Day04.Review2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
案例需求
定义一个日期工具类(DateUtils)，包含两个方法：把日期转换为指定格式的字符串；
把字符串解析为指定格式的日期，然后定义一个测试类(DateDemo)，测试日期工具类的方法
 */
class DateUtils{
    private DateUtils() {
    }
    public static String DateToString(Date d, String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s=sdf.format(d);
        return s;
    }
    public static Date StringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date d=sdf.parse(s);
        return d;
    }
}
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(DateUtils.DateToString(d,"yyyy年MM月dd日 HH时mm分ss秒"));
        System.out.println("==========================================");
        System.out.println(DateUtils.StringToDate("2048-4-5 11:11:11","yyyy-MM-dd HH:mm:ss"));
    }
}