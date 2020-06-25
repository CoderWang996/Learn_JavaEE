package cn.itcast.Day14.Homework4;
/*
【编号：1704】一个正整数的阶乘（factorial）是所有小于及等于该数的正整数的积，并且0的阶乘为1。
 即：n的阶乘 = 1 * 2 * 3 * 4 * ... * n。 请使用递归知识，求10的阶乘是多少。
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
