package cn.itcast.Day14.Homework1;

import java.io.File;
import java.io.IOException;

/*
 【编号：1701】请查询java.io.File类相关API，使用java程序，依次完成如下操作。
 【警告：java程序删除文件时，不会将文件放入回收站，慎重操作！！！】
1、请在D:\\FileTest目录（该目录已存在）下创建一个文件java.txt
2、请在D:\\FileTest目录（该目录已存在）下创建一个文件夹javase
3、请在D:\\FileTest目录（该目录已存在）下创建一个多级目录JavaWEB\\HTML
4、请在D:\\FileTest\\heima目录（该目录不存在）下，创建一个文件hello.txt
5、请将需求1中，创建的文件java.txt删除
6、请将需求3中，创建的目录JavaWEB删除
7、请将需求4中，创建的文件hello.txt，改名为world.txt
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\FileTest");
        f.mkdir();
        File f1=new File("D:\\FileTest\\java.txt");
        System.out.println(f1.createNewFile());
        File f2=new File("D:\\FileTest\\javase");
        System.out.println(f2.mkdir());
        File f3=new File("D:\\FileTest\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        File f4=new File("D:\\FileTest\\heima");
        System.out.println(f4.mkdir());
        File f5=new File("D:\\FileTest\\heima\\hello.txt");
        System.out.println(f5.createNewFile());
        System.out.println(f1.delete());
        System.out.println(f3.delete());
        System.out.println(f5.renameTo(new File("D:\\FileTest\\heima\\world.txt")));
    }
}
