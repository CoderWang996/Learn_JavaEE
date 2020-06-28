package JUNE.src.cn.itcast.Day13.Map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("王晨阳","宿州");
        map.put("任晨","黄山");
        map.put("廖代佳悦","西安");
        map.put("徐熙","安庆");
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"来自："+entry.getValue());
        }
    }
}
