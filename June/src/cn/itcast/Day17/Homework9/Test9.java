package cn.itcast.Day17.Homework9;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

/*
【编号1901】我们可以使用IO流读取和写入数据，来完成文件的复制操作
 但IO流是不可以直接操作文件夹的，新文件夹需要通过File类的API进行创建。
 现在D盘下的FileTest文件夹下，有若干文件（不包含子文件夹），请将该文件夹整体拷贝到E盘目录下。
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\FileTest");
        String f1Name=f1.getName();
        File f2=new File("E:",f1Name);
        FileUtils.copyDirectory(f1,f2);
    }
}
