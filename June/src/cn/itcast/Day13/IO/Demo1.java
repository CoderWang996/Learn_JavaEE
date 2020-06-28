package JUNE.src.cn.itcast.Day13.IO;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\mycast\\IT.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------------");
        File f2=new File("D:\\mycast\\It");
        System.out.println(f2.mkdir());
        System.out.println("--------------");
        File f3=new File("D:\\mycast\\cast\\it");
        System.out.println(f3.mkdirs());
    }
}
