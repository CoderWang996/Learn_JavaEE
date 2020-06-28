package cn.itcast.Day10.Code1;

public class Main {
    public static void main(String[] args) {
        int n=100;
        String s=""+n;
        System.out.println("字符拼接"+s);
        String s2=String.valueOf(n);
        System.out.println("String.valueof"+s2);
        String s3="200";
        Integer i=Integer.valueOf(s3);
        int x=i.intValue();
        System.out.println("普通版String转int"+x);
        int y=Integer.parseInt(s3);
        System.out.println("parseInt方法"+y);
        int q=200;
        String w=String.valueOf(q);
        System.out.println("int转String2"+w);
    }
}
