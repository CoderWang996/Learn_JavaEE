package cn.itcast.Day08.Test;

import java.util.Arrays;
import java.util.Scanner;
//练习选择排序和二分查找
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入您要输入的数字的个数");
        int n = cin.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入这" + n + "个数");
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("选择排序后的数组为：" + Arrays.toString(arr));
        System.out.println("请输入您要查找的数字：");
        int a = cin.nextInt();
        int index = binarySearch(arr, a);
        if (index>=0){
            System.out.println(a+"在数组中的索引为"+index);
        }else {
            System.out.println("抱歉，没有查到");
        }
    }

    private static int binarySearch(int[] arr, int a) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        while (start <= end) {
            if (arr[middle]>a){
                end=middle-1;
                middle=(start+end)/2;
            }
            else if(arr[middle]<a){
                start=middle+1;
                middle=(start+end)/2;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}