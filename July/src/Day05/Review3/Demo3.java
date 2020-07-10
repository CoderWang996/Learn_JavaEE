package Day05.Review3;

import java.io.*;

//将当前模块下的Day05\\Review1\\Demo1复制到当前模块下的copy.java 字节流转字符流版本
public class Demo3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("July\\src\\Day05\\Review1\\Demo1.java"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("July\\copy.java"));
        char []chars=new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        osw.close();
        isr.close();
    }
}
