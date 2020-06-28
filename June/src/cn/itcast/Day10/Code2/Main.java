package cn.itcast.Day10.Code2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s="1 2 3 4 5 6";
        String []arr=s.split(" ");
        int []a=new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        String s1=Arrays.toString(a);
        String result=s1.replace("[","").
                replace("]","").
                replace(",","");
        System.out.println(result);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
