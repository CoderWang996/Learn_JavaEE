package Day02.Homework4;

import java.util.Scanner;
import java.util.function.Function;
/*
请调用上述定义的sum方法，实现：对于传入的正整数n，
获取从1到n之间的整数之和，对于传入的负整数n，
获取从n到-1之间的整数之和。请使用Lambda表达式实现。
 */
public class Test4 {
    public static void main(String[] args) {
        // 在此处调用sum方法，将结果打印到控制台
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        if (n>=0){
            int s1=sum(n,i->{
                for (int j = 0; j < n; j++) {
                    i+=j;
                }
                return i;
            });
            System.out.println(s1);
        }else {
            int s2=sum(n,i->{
                for (int j=-1;j>n;j--){
                    i+=j;
                }
                return i;
            });
            System.out.println(s2);
        }
    }

    public static Integer sum(Integer i, Function<Integer, Integer> fun) {
        return fun.apply(i);
    }
}
