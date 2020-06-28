package cn.itcast.Day17.Homework5;

import java.io.*;
import java.util.ArrayList;

/*
【编号：1805】现获取到一些人员的姓名信息，存储在ArrayList集合中，如下：
ArrayList<String> list = new ArrayList<>();
list.add("Tom");
list.add("Jerry");
list.add("Lucy");
list.add("Lily");
list.add("John");
list.add("Kevin");
请编程程序，将这些信息保存至当前模块下的name.txt文件中，每个名字占据一行的位置。
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Lucy");
        list.add("Lily");
        list.add("John");
        list.add("Kevin");
        BufferedWriter bw=new BufferedWriter(new FileWriter("ITheima\\names.txt"));
        for (String s : list) {
            bw.write(s.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
