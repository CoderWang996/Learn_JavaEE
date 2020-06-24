package JUNE.src.cn.itcast.Day13.Contains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(120);
        list.add(24);
        list.add(100);
        list.add(60);
     Collections.sort(list);//快速排序
        System.out.println(list);
     Collections.reverse(list);//翻转
        System.out.println(list);
     Collections.shuffle(list);//打乱顺序
        System.out.println(list);
    }
}
