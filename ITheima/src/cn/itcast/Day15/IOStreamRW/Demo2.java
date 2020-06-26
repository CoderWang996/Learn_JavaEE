package cn.itcast.Day15.IOStreamRW;

import java.io.*;

//用字符流复制Java文件
public class Demo2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("ITheima\\copyMe.java"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("ITheima\\copy.java"));
        char []chars=new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        osw.close();
        isr.close();
    }
}
