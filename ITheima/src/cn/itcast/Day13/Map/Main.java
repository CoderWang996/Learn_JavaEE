package JUNE.src.cn.itcast.Day13.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//HashMap既能存储也能修改
public class Main {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("王晨阳","宿州");
        map.put("任晨","黄山");
        map.put("廖代佳悦","西安");
        map.put("徐熙","安庆");
        System.out.println( map.get("王晨阳"));//通过键找值
        System.out.println(map.remove("徐熙"));//通过键删除键值对应元素
        System.out.println(map.containsKey("任晨"));//判断是否包含指定键
        Set<String> Keys=map.keySet();//获取Map中所有键的集合
        for (String key : Keys) {
            System.out.println(key+"-->"+map.get(key));
        }
        Collection<String> values=map.values();//获取Map中所有值的集合
        for (String s:values){
            System.out.println(s);
        }
    }
}
