package cn.itcast.Day08.MaopaoSort;
//冒泡排序
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int []arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=cin.nextInt();
        }
        /*
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         */
        Arrays.sort(arr);
        System.out.println("排序后的数组为"+ Arrays.toString(arr));
        int a=cin.nextInt();
        int index= binarySearch(arr,a);
        System.out.println(index);
}

    private static int binarySearch(int[] arr, int a) {
        int Start=0;
        int End=arr.length-1;
        int middle=(Start+End)/2;
        while (Start<=End){
            if(arr[middle]>a){
                End=middle-1;
                middle=(Start+End)/2;
            }
            else if(arr[middle]<a){
                End=middle+1;
                middle=(Start+End)/2;
            }
            else {
                return middle;
            }
        }
        return -2;
    }
    }
