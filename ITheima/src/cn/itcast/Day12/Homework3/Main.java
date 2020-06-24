package JUNE.src.cn.itcast.Day12.Homework3;

import java.util.*;

/*
【编号：1503】下面有一些程序员经常访问的IT网站（排名不分先后）：
              itheima, chinaunix, itpub, csdn, 51cto, iteye...
              请将以上网站名称作为字符串元素，按照字典顺序存入set集合中，并遍历查看结果。
 */
public class Main {
    public static void main(String[] args) {
        Set<String> s=new TreeSet<>();
        s.add("itheima");
        s.add("chinaunix");
        s.add("itpub");
        s.add("csdn");
        s.add("51cto");
        s.add("iteye...");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
