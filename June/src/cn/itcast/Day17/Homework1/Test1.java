package cn.itcast.Day17.Homework1;

import java.io.*;

/*
【编号：1801】在文件的读写操作中，可以自定义一个字节数组作为缓冲区，来提高读写的效率。
 而java也提供了内置缓冲区的缓冲流可以高效的一次读取很多字节。
 请使用缓冲流完成如下需求：将"D:\\itcast\\mn.jpg"图片文件（也可以是其他图片文件）拷贝到当前模块目录下。
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("D:\\itcast\\mn.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("ITheima\\mn.jpg"));

        byte []bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
