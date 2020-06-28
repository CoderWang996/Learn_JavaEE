package cn.itcast.Day14.Homework6;
import java.io.File;

/*
【编号：1706】File类，提供了一个length()方法，可以获取文件的大小，
以字节为单位。但该方法不能用于获取文件夹的大小，
请使用递归编写程序，对于给定的一个路径，
比如D:\\itcast，统计该文件夹的大小（包含子目录下的所有文件）
 */
public class Test6 {
    public static void main(String[] args) {
        long len=getDirlength(new File("D:\\itcast"));
        System.out.println(len);
    }
    public static long getDirlength(File Dir){
        long len=0;
        File []files=Dir.listFiles();
        if(files!=null){
         for (File file : files) {
             if (file.isFile()){
                 len+=file.length();
             }else {
                 len+=getDirlength(file);
             }
         }
        }
        return len;
    }
}
