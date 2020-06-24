package JUNE.src.cn.itcast.Day12.Homework4;
/*
【编号：1504】以下代码完成的功能是遍历HashSet集合，
打印每个字符串元素以及元素的长度。但运行程序后出现异常，
请排查错误原因并改正，以保证代码能够正确运行。
 */
import java.util.HashSet;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        // 1. 创建HashSet集合
        HashSet<String> hs = new HashSet<>();
        // 2. 添加数据到集合
        hs.add("itcast");
        hs.add("itheima");
        hs.add("javase");
        // 3. 迭代器遍历集合元素
        Iterator<String> it = hs.iterator();
        while(((Iterator) it).hasNext()){
            String ss=it.next();
            System.out.println(ss); // 元素
            System.out.println(ss.length()); // 元素长度
        }
    }
}