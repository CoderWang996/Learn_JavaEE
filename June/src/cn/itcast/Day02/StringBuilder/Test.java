package cn.itcast.Day02.StringBuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("我叫").append("王晨阳,").append("我的手机号是：18155719219");
        StringBuilder sb2=new StringBuilder();
        sb2.append("12345");
        sb2.reverse();
        System.out.println(sb);
        System.out.println(sb2);
    }
}
