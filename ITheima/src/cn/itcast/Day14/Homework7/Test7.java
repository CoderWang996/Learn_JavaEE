package cn.itcast.Day14.Homework7;
import java.io.File;

/*
【编号：1707】File类，提供了delete()方法，可以删除文件或者文件夹。但删除文件夹时，
 必须保证文件夹为空才会删除成功。请利用递归编程，定义删除文件夹的方法。
 比如给定非空目录：D:\\FileTest，可以将这个目录删除。
 【警告：java程序删除文件时，不会将文件放入回收站，慎重操作！！！】
 */
public class Test7 {
    public static void main(String[] args) {
        deleteAllfile(new File("D:\\FileTest"));
    }
    public static void deleteAllfile(File Dir){
        File []files=Dir.listFiles();
        if (files!=null){
            for (File file : files) {
                if(file.isFile()){
                    file.delete();
                }else {
                    deleteAllfile(file);
                }
            }
        }
        Dir.delete();
        }
    }

