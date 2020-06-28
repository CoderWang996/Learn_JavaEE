package cn.itcast.Day17.Homework2;

import java.io.*;

/*
【编号：1802】请使用缓冲流将D盘下的某个音频或者视频文件，拷贝到当前模块目录下，
 并计算拷贝过程消耗的时间，将时间（单位毫秒）打印到控制台。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\MyAPP\\myapp.mp4"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("ITheima\\myapp.mp4"));
        byte []bys=new byte[1024];
        int len;
        long start=System.currentTimeMillis();
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
        long end=System.currentTimeMillis();
        System.out.println("共用时"+(end-start)+"毫秒");
    }
}
