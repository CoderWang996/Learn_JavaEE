package cn.itcast.Day04.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        System.out.println(arrayList);
        arrayList.add("Hellow");
        arrayList.add("程序员.");
        arrayList.add("请开始你的表演！");
        System.out.println(arrayList);
        arrayList.add(2,"王晨阳");
        System.out.println(arrayList);
    }
}
