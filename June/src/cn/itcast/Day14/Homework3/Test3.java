package cn.itcast.Day14.Homework3;
/*
【编号：1703】斐波那契数列（fibonacci）是指这样一个数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
 这个数列从第3项开始，每一项都等于前两项之和。请使用递归知识，求数列第20项的值。
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(fibo(20));
    }
    public static int fibo(int n){
        if(n==1||n==2){
            return 1;
        }
        else {
            return fibo(n-2)+fibo(n-1);
        }
    }
}
