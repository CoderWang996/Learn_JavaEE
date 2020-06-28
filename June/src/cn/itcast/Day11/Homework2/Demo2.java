package cn.itcast.Day11.Homework2;

import java.util.ArrayList;
import java.util.List;
/*
【编号：1402】现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，
请将所有的元素按顺序存入集合中，并查看存储结果。请补充如下代码完成需求。
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        System.out.println(list);
    }
}