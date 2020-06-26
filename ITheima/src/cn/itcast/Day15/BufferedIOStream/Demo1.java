package cn.itcast.Day15.BufferedIOStream;

import java.io.*;

public class Demo1 {
    public static void main(String[] args)throws IOException {
        long startTime=System.currentTimeMillis();
        methond1();
        //methond2();
        long endTime=System.currentTimeMillis();
        System.out.println("共用时："+(endTime-startTime)+"毫秒");
    }
    public static void methond1() throws IOException{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\TesFile\\ok.gif"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("ITheima\\nfile.gif"));
        int by;
        while ((by=bis.read())!=-1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }
    public static void methond2() throws IOException{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\TesFile\\ok.gif"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("ITheima\\nfile.gif"));
        byte []bys=new byte[1024];
        int len;
        while ((len=bis.read())!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
