package cn.itcast.Day11.Homework1;

import java.util.ArrayList;
import java.util.Collection;

/*
【编号：1401】请补齐下列代码，找出其中的单列集合名称作为字符串元素存储到集合中，
随后打印集合元素 [ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap ]
 */
public class Demo1 {
    public static void main(String[] args) {
        // 1. 创建集合对象
        Collection<String> c = new ArrayList<>();
        // 2. 添加元素到集合中
        c.add("ArrayList");
        c.add("LinkedList");
        c.add("HashSet");
        c.add("TreeSet");
        c.add("HashMap");
        c.add("TreeMap ");
        // 3. 打印并显示集合元素
        System.out.println(c);
    }
}