package cn.itcast.Day15.IOStreamRW;

import java.io.*;

public class Demo4 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw=new BufferedWriter(new FileWriter("ITheima\\copyMe.java"));
//        bw.write("你好呀" );
//        bw.write(System.lineSeparator());
//        bw.write("小美眉");
//        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("ITheima\\copyMe.java"));
        char []chs=new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        br.close();
    }
}
