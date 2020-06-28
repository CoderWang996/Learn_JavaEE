package JUNE.src.cn.itcast.Day13.Homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
【编号：1601】现获取到学校的一些课程及授课老师的信息，数据如下：
 老师：Tom 课程：java 老师：Kevin 课程：python 老师：Lily 课程：c++ 老师：Lucy 课程：PHP
  请将以上信息以字符串的形式一一对应存储在集合中，并遍历展示，需要使用两种遍历方式。输出结果如下：
Kevin---python
Tom---java
Lucy---php
Lily---c++
 */
public class h1 {
    public static void main(String[] args) {
        HashMap<String,String> hs=new HashMap<>();
        hs.put("Tome","java");
        hs.put("Kevin","python");
        hs.put("Lily","c++");
        hs.put("Lucy","PHP");
        //entrySet遍历
        Set<Map.Entry<String, String>> entries = hs.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        //keySet遍历
        Set<String> keys = hs.keySet();
        for (String key : keys) {
            System.out.println(key+"---"+hs.get(key));
        }
    }
}
