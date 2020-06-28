package cn.itcast.Day17.Homework4;

import java.io.*;

/*
【编号：1804】已知在“D:\\字符流和字节流.txt”文件中，保存着一些文本信息（直接准备好文件即可），如下：
字符流的由来：因为数据编码的不同，而有了对字符进行高效操作的流对象。
本质其实就是基于字节流读取时，去查了指定的码表。字节流和字符流的区别：
（1）读写单位不同：字节流以字节（8bit）为单位，字符流以字符为单位，根据码表映射字符，一次可能读多个字节。
（2）处理对象不同：字节流能处理所有类型的数据（如图片、avi等），而字符流只能处理字符类型的数据。
（3）字节流在操作的时候本身是不会用到缓冲区的，是文件本身的直接操作的；
而字符流在操作的时候下后是会用到缓冲区的，是通过缓冲区来操作文件。
请编写程序将文本内容读取出来，保存为字符串格式，并打印到控制台。
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\字符流和字节流.txt"),"UTF-8");
        char []chars=new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
//        System.out.println();
        isr.close();
    }
}
