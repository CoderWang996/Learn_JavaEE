package cn.itcast.Day15.IOStreamRW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("ITheima\\copyMe.java");
        FileWriter fw=new FileWriter("ITheima\\copy.txt");
        char []chars=new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }
        fw.close();
        fr.close();
    }
}
