package cn.itcast.Day11.Homework3;

import java.util.ArrayList;
import java.util.Iterator;
/*
【编号：1403】顺序列表ArrayList中存储了如下字符串
["hehe", "haha", "heihei", "gege", "gaga"]，
请使用迭代器遍历集合，按顺序输出元素。
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hehe");
        arrayList.add("haha");
        arrayList.add("heihei");
        arrayList.add("gege");
        arrayList.add("gaga");
        Iterator<String> it=arrayList.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
    }
}
