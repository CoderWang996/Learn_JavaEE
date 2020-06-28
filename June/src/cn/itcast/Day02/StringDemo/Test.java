package cn.itcast.Day02.StringDemo;

public class Test {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1==s2);
        String s3="a"+"b"+"c";
        String s4="abc";
        String s5=s3+"def";
        String s6="abcdef";
        System.out.println(s1==s4);
        System.out.println(s3==s4);
        System.out.println(s5==s6);
    }
}
