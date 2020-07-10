package Day05.Review1;

import java.io.File;

//给定一个路径(E:\\itcast)，通过递归完成遍历该目录下所有内容，并把所有文件的绝对路径输出在控制台
public class Demo1 {
    public static void main(String[] args) {
        File file=new File("July\\src");
        getFilePath(file);

    }
    public static void getFilePath(File srcFile){
        File []files=srcFile.listFiles();
        if (files!=null){
            for (File file : files) {
                if (file.isDirectory()){
                    getFilePath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
