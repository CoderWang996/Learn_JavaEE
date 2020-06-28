package JUNE.src.cn.itcast.Day13.Homework2;

import java.util.*;

/*
【编号：1602】现将某位学员的属性信息，以属性名对应属性值的格式存储在map集合中，数据如下：
"姓名"="张三"
"年龄"="20"
"性别"="男"
"地址"="北京海淀区"
"专业"="java"
请使用程序判断，其属性中是否包含地址信息，如果包含，请将地址信息修改为"北京顺义区"，并遍历修改后的结果。输出结果如下：
包含学员的地址信息
地址信息由：北京海淀区，修改为：北京顺义区
修改后的所有信息如下：
姓名=张三
地址=北京顺义区
年龄=20
专业=java
性别=男
 */
public class h2 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hs=new LinkedHashMap<>();
        hs.put("姓名","张三");
        hs.put("年龄","20");
        hs.put("性别","男");
        hs.put("地址","北京海淀区");
        hs.put("专业","Java");
        if (hs.containsValue("北京海淀区")){
            hs.put("地址","北京顺义区");
        }
        Set<Map.Entry<String, String>> entries = hs.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
