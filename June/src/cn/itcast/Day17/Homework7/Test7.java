package cn.itcast.Day17.Homework7;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.TreeMap;

/*
【编号：1807】在当前模块目录下，有一个“msg.txt”文件（直接准备好即可），其中的文本内容保存了一个学生的信息，如下：
id=heima001
name=张三
age=23
school=黑马程序员
每条信息都是属性名称=属性值的格式，每条信息占据一行。 请编程读取文件中的内容，
将等号前面的部分作为键，等号后面的部分作为值，存入map集合中。
 */
public class Test7 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("ITheima\\msg.txt");
        Properties prop=new Properties();
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}
