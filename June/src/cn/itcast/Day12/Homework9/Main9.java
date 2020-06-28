package JUNE.src.cn.itcast.Day12.Homework9;

import java.util.Comparator;
import java.util.TreeSet;
/*
【编号：1510】现获取到一个字符串"90 -7 0 18 2 0 2 2 45 4"，
其中的数据是空格间隔的一些数字，
请使用集合所学知识将字符串中的数值进行降序排序，但不要去除其中的重复数字。
 */
public class Main9 {
    public static void main(String[] args) {
        String s = "90 -7 0 18 2 0 2 2 45 4";
        String[] arr =s.split(" ");
        TreeSet<Integer> ts=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer num=o2-o1;
                return num==0?1:num;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            ts.add(Integer.valueOf(arr[i]));
        }
        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}