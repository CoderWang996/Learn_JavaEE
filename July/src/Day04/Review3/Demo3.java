package Day04.Review3;

import java.util.Calendar;
import java.util.Scanner;

//获取任意一年的二月有多少天
public class Demo3 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int year=cin.nextInt();
        Calendar c=Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int d=c.get(Calendar.DATE);
        System.out.println(year+"年的2月有"+d+"天");
    }
}
