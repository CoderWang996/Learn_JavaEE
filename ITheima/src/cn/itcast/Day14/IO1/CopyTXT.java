package cn.itcast.Day14.IO1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//复制TXT文件
public class CopyTXT {
    public static void main(String[] args) throws IOException {
        //读一次写一次
        FileInputStream fox=new FileInputStream("June\\fox.txt");
        FileOutputStream myfox=new FileOutputStream("June\\myfox");
        int by;
        while ((by=fox.read())!=-1){
            myfox.write(by);
        }
        //先关存  后关读
        myfox.close();
        fox.close();
    }
}
