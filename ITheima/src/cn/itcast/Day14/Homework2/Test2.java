package cn.itcast.Day14.Homework2;

import java.io.File;

/*
【编号：1702】在D:\\FileTest目录下，有若干文件夹和文件，
  请将该目录下所有的java文件的名称打印到控制台上。
  仅输出该目录下的即可，不考虑子文件夹下的文件。
 */
public class Test2 {
    public static void main(String[] args) {
        File file=new File("D:\\FileTest") ;
        File[] farr=file.listFiles();
        for (File f : farr) {
            if(f.isFile()&&f.getName().endsWith(".java")){
                System.out.println(f.getName());
            }
        }
    }
}
