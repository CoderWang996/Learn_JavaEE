package JUNE.src.cn.itcast.Day12.Homework2;

import java.util.LinkedHashSet;
import java.util.Set;

/*
【编号：1502】2019年1月份的世界编程语言排行榜从高到低依次如下：
 Java、C、Python、C++、Visual Basic .NET、JavaScript...
 请将以上语言名称作为字符串元素，按顺序存入set集合中
 ，并遍历查看。要求存储和遍历的顺序保持一致。
 */
public class Main {
    public static void main(String[] args) {
        Set<String> s=new LinkedHashSet<>();
        s.add("Java");
        s.add("C");
        s.add("Python");
        s.add("C++");
        s.add("Visual");
        s.add("Basic");
        s.add("NET");
        s.add("JavaScript");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
