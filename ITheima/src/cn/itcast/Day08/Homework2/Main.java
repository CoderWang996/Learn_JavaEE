package cn.itcast.Day08.Homework2;

import java.util.Arrays;
import java.util.Scanner;

/*
已知数组： int[] arr = {56, 89, 32, 44, 12}, 要求使用三种方式对其进行升序排列，
并对排序后的数组进行查找： 要求： 键盘任意录入一个数
控制台输出对应得索引，如果找不到，就输出 -1（这个查找需求用两种方式实现）。
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {56, 89, 32, 44, 12};
        //第一种排序
        Arrays.sort(arr);
        System.out.println("第一种排序的结果为"+Arrays.toString(arr));
        //冒泡排序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("冒泡排序的结果为"+Arrays.toString(arr));
        //选择排序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("选择排序的结果为"+Arrays.toString(arr));
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入你要查找的数字：");
        int a=cin.nextInt();
        int index=Arrays.binarySearch(arr,a);
        if(index>=0){
            System.out.println("您查的数字在数组中的索引为："+index);
        }else {
            System.out.println(-1);
        }
    }
}
