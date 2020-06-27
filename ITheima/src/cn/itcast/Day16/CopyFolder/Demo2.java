package cn.itcast.Day16.CopyFolder;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
//第三方阿帕奇jar包实现文件复制
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\Copyme");
        String f1Name=f1.getName();
        File f2=new File("ITheima",f1Name);
        FileUtils.copyDirectory(f1,f2);
    }
}
