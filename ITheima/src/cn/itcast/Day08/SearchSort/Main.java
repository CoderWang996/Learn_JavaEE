package cn.itcast.Day08.SearchSort;

import java.util.Arrays;
import java.util.Scanner;

//选择排序
public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入您一共要输入的数字的个数");
        int x=cin.nextInt();
        int []arr=new int[x];
        System.out.println("请输入"+x+"个数");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=cin.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("排序后的结果为"+Arrays.toString(arr));
        System.out.println("请输入您要查的数字");
        int a=cin.nextInt();
        int index=Arrays.binarySearch(arr,a);
        if (index>=0){
            System.out.println("您要查的数的索引为"+index);
        }
        else{
            System.out.println("没有找到您要查找的数");
        }

    }
}
