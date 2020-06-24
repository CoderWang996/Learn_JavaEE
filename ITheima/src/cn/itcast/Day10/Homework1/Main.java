package cn.itcast.Day10.Homework1;
/*
现获取到两个字符串格式的数字：字符串23和字符串24。请编写程序，计算两个数字的和，并输出在控制台。 运行结果：
   相加结果为：47

 */
public class Main {
    public static void main(String[] args) {
        String s1="23";
        String s2="24";
        int  i1=Integer.valueOf(s1);
        int i2=Integer.valueOf(s2);
        System.out.println(i1+i2);
    }
}