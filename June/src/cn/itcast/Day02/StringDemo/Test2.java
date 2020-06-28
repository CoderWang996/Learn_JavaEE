package cn.itcast.Day02.StringDemo;

public class Test2 {
    public static void main(String[] args) {
        char []arr=new char[]{'a','b','c'};
        String s1=new String(arr);
        String s2=new String(arr);
        String s3="abc";
        String s4="a"+"b"+"c";
        String s5="ABc";
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s4.equals(s3));//true
        System.out.println(s4.equals(s5));//false
        System.out.println(s4.equalsIgnoreCase(s5));//true
    }
}
