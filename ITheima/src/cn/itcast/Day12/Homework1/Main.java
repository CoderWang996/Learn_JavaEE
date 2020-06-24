package JUNE.src.cn.itcast.Day12.Homework1;

import java.util.HashSet;
/*
【编号：1501】请将如下4个字符串数据["aaa"，"bbb"，"ccc"，"ddd"]，
依次添加到HashSet集合中，并遍历查看存储结果。
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        for (String h : hs) {
            System.out.println(h);
        }
    }
}
