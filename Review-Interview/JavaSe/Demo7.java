import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo7 {
    public static void main(String[] args) {
        //Date类测试
        Date date1 = new Date();
        System.out.println(date1);//Thu Nov 12 18:44:44 CST 2020
        long date2 = 1000*60*60;
        Date d2 = new Date(date2);
        System.out.println(d2);//Thu Jan 01 09:00:00 CST 1970
        //时间格式转换
        //1 Date-String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date1);
        System.out.println(format);//2020-11-12 18:48:53
        //2 String-Date
        String sj="2048-08-09 11:11:11";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = dateFormat.parse(sj);
            System.out.println(parse);//Sun Aug 09 11:11:11 CST 2048
        } catch (ParseException e) {
            e.printStackTrace();
        }


        //Calendar类测试
        //创建对象
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);//Thu Nov 12 18:56:37 CST 2020
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
        //根据日历的规则，将指定的时间量添加或减去给定的日历字段
        calendar.add(Calendar.YEAR,-3);
        Date t = calendar.getTime();
        System.out.println(t);//Sun Nov 12 19:03:43 CST 2017
        //设置当前日历的年月日
        calendar.set(2060,5,6);
        String dd = simpleDateFormat.format(calendar.getTime());
        System.out.println(dd);//2060-06-06 19:05:47
    }
}
