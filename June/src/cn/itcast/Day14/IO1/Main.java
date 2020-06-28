package cn.itcast.Day14.IO1;

import java.io.File;
import java.io.IOException;
//        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
//        public boolean isFile()：测试此抽象路径名表示的File是否为文件
//        public boolean exists()：测试此抽象路径名表示的File是否存在
//        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
//        public String getPath()：将此抽象路径名转换为路径名字符串
//        public String getName()：返回由此抽象路径名表示的文件或目录的名称
//        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
public class Main {
    public static void main(String[] args) throws IOException {
        File f1=new File("IO\\Java.txt");
        System.out.println(f1.createNewFile());
        System.out.println(f1.delete());
        File f2=new File("IO\\itcast");
        System.out.println(f2.mkdir());
        File f3=new File("IO\\itcast\\IT.txt");
        System.out.println(f3.createNewFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.exists());
        System.out.println(f3.isFile());
        System.out.println(f2.getAbsoluteFile());
        System.out.println(f3.getName());
        System.out.println(f1.getPath());
        File f4=new File("D:\\桌面\\MY code");
        String []arr=f4.list();
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println(f3.delete());
        System.out.println(f2.delete());
    }
}
