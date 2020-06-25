package cn.itcast.Day14.Homework8;

import java.io.*;

/*
请使用字节流，把“D:\itcast\窗里窗外.txt”文件，复制到模块目录下的“窗里窗外.txt”。
 */
public class Test8 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("D:\\itcast\\窗里窗外.txt");
        FileOutputStream f2=new FileOutputStream("ITheima\\窗里窗外.txt");
        while ((int)f1.read()!=-1){
            f2.write(f1.read());
        }
        f2.close();
        f1.close();
    }
}
