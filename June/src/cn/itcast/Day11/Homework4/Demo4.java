package cn.itcast.Day11.Homework4;
/*
【编号：1404】以下代码存在并发修改异常，
请对代码完成修改，使程序可以正确运行。
运行结果：
[a, c, d]
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {
    public static void main(String[] args) {
        // 1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加集合元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (int i = 0; i < list.size(); i++) {
            if ("b".equals(list.get(i))){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}