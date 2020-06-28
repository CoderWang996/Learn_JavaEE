package cn.itcast.Day16.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();

        //把文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException {
        FileReader fr=new FileReader("ITheima\\lookme.txt");
        Properties prop=new Properties();
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException{
        Properties prop=new Properties();
        prop.setProperty("王晨阳","宿州");
        prop.setProperty("任晨","黄山");
        prop.setProperty("徐熙","安庆");
        FileWriter fw=new FileWriter("ITheima\\lookme.txt");
        prop.store(fw,"look!");
        fw.close();

    }
}
