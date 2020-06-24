package cn.itcast.Day14.IO1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//键盘录入n个字符存入txt文件并读取
public class FileOutPutStremDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象（）
        FileOutputStream fox=new FileOutputStream("June\\fox.txt",true);
        //单个写入fox.write(98);
        //多个写入byte []bys="abcced".getBytes();
        //fox.write(bys);
        //fox.write(bys,1,4);
        //往文件写入n个相同的字符并换行
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入个数：");
        int n=cin.nextInt();
        for (int i = 0; i < n; i++) {
            fox.write("mycode".getBytes());
            fox.write(System.lineSeparator().getBytes());
        }
        System.out.println("写入成功");
        fox.close();
        //读取文件中所有字符数据
        FileInputStream ff=new FileInputStream("June\\fox.txt");
        int by;
        while ((by=ff.read())!=-1){
            System.out.print((char)by);
        }
        ff.close();
    }
}
