package cn.itcast.Day14.Homework5;

import java.io.File;

/*
【编号：1705】给定一个路径(E:\\itcast)，
 通过递归完成遍历该目录下所有内容，并把所有文件的绝对路径输出在控制台。
 */
public class Test5 {
    public static void main(String[] args) {
        File file=new File("E:\\itcast");
        File []src=file.listFiles();
    }
    public static void getAllFile(File srcfile){
        File []arr=srcfile.listFiles();
        if (srcfile!=null){
            for (File file : arr) {
                if(file.isDirectory()){
                    getAllFile(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
