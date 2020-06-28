package cn.itcast.Day14.IO1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStremDemo1 {
    public static void main(String[] args) {
        FileOutputStream myTxt=null;
        try{
            myTxt=new FileOutputStream("June\\myTxt.txt");
            myTxt.write("hello".getBytes());
        }catch (IOException e){
            e.printStackTrace();
    }finally {
            if (myTxt!=null){
                try {
                    myTxt.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
