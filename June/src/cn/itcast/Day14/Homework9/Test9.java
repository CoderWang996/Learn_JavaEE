package cn.itcast.Day14.Homework9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
【编号：1709】在复制文件的操作中，我们可以使用如下的方法，每次读取一个字节的数据：
public int read() //FileInputStreamd的读取数据方法，返回值表示读取的数据的字节值
但这样的效率比较低，我们还可以采用如下方式，建立缓冲区，每次读取若干字节的数据：
public int read(byte[] b) //读取最多b.length个字节的数据为字节数组，返回值表示读入数组中的字节数
请采用这种读取方式，把“E:\\itcast\\mn.jpg”复制到模块目录下的“mn.jpg”。
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("E:\\itcast\\mn.jpg");
        FileOutputStream f2=new FileOutputStream("ITheima\\mn.jsp");
        byte []bys=new byte[1024*4];
        while ((int)f1.read()!=-1){
            f2.write(bys,0,f1.read());
        }
        f2.close();
        f1.close();
    }
}
