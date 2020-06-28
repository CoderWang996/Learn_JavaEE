package JUNE.src.cn.itcast.Day13.Homework3;
/*
【编号：1603】现已知世界杯举办的年份以及对应年份的冠军国家信息，数据如下：
("1930", "乌拉圭");
("1934", "意大利");
("1938", "意大利");
("1950", "乌拉圭");
("1954", "西德");
("1958", "巴西");
("1962", "巴西");
("1966", "英格兰");
("1970", "巴西");
("1974", "西得");
("1978", "阿根廷");
("1982", "意大利");
("1986", "阿根廷");
("1990", "西得");
("1994", "巴西");
("1998", "法国");
("2002", "巴西");
("2006", "意大利");
("2010", "西班牙");
("2014", "德国");
("2018", "法国");
请编写程序，可以根据年份查询该年份的冠军国家，也可以根据国家，查询该国家获得世界杯冠军的所有年份。运行效果如下：
请输入年份：
2018
2018年的世界杯冠军是：法国
请输入国家：
巴西
巴西获得世界杯的年份是：
1962
1994
1970
2002
1958
------如果输入的年份和国家没有匹配，输出如下------
请输入年份：
2017
2017年没有举办世界杯
请输入国家：
中国
中国没有获得过世界杯冠军
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class h3 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1930", "乌拉圭");
        hm.put("1934", "意大利");
        hm.put("1938", "意大利");
        hm.put("1950", "乌拉圭");
        hm.put("1954", "西德");
        hm.put("1958", "巴西");
        hm.put("1962", "巴西");
        hm.put("1966", "英格兰");
        hm.put("1970", "巴西");
        hm.put("1974", "西得");
        hm.put("1978", "阿根廷");
        hm.put("1982", "意大利");
        hm.put("1986", "阿根廷");
        hm.put("1990", "西得");
        hm.put("1994", "巴西");
        hm.put("1998", "法国");
        hm.put("2002", "巴西");
        hm.put("2006", "意大利");
        hm.put("2010", "西班牙");
        hm.put("2014", "德国");
        hm.put("2018", "法国");
        Scanner cin = new Scanner(System.in);
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        System.out.println("请输入年份");
        String year = cin.next();
            if (hm.containsKey(year)) {
                System.out.println(year + "年的冠军是：" +hm.get(year));
            }else {
                System.out.println(year+"年没有举办世界杯");
            }
        System.out.println("请输入国家：");
        String country=cin.next();
        Set<String> keys = hm.keySet();
        if(hm.containsValue(country)){
            System.out.println(country+"获得世界杯的年份是：");
            for (String key : keys) {
                String values=hm.get(key);
                if(country.equals(values)){
                    System.out.println(key);
                }
        }
        }else {
               System.out.println(country+"没有获得过世界杯冠军");
           }
    }
}

