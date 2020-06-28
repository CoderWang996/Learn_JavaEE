package cn.itcast.Day17.Homework10;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*
【编号1902】我们可以使用IO流读取和写入数据，来完成文件的复制操作，
但IO流是不可以直接操作文件夹的，新文件夹需要通过File类的API进行创建。
请实现将D盘下的itcast文件夹（包含其所有子内容），整体复制到E盘下。
（即模拟Windows系统的复制粘贴操作）。
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\itcast");
        String f1Name=f1.getName();
        File f2=new File("C:",f1Name);
        FileUtils.copyDirectory(f1,f2);
    }
}
