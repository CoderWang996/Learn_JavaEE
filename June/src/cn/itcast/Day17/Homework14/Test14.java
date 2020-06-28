package cn.itcast.Day17.Homework14;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
已知在当前模块目录下，有一个user.properties文件（直接准备好即可），内容如下：
username=heima001
passworld=123456
url=http://www.itheima.com
subjectName=javaee
请编写程序，将文件中的内容以键值对的形式存储到Properties集合中，并遍历查看结果。
 */
public class Test14 {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        FileReader fr=new FileReader("ITheima\\user.properties");
        prop.load(fr);
        fr.close();
        Set<Object> objects = prop.keySet();
        for (Object object : objects) {
            System.out.println(object+"="+prop.get(object));
        }
    }
}
