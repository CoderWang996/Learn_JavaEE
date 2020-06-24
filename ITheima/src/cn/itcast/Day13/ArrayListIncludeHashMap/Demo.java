package JUNE.src.cn.itcast.Day13.ArrayListIncludeHashMap;

import java.util.ArrayList;
import java.util.HashMap;
//ArrayList里面嵌套HashMap
public class Demo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<>();
        HashMap<String,String> hs1=new HashMap<>();
        hs1.put("王晨阳","宿州");
        array.add(hs1);
        HashMap<String,String> hs2=new HashMap<>();
        hs2.put("任晨","黄山");
        array.add(hs2);
        HashMap<String,String> hs3=new HashMap<>();
        hs3.put("廖代佳悦","西安");
        array.add(hs3);
        HashMap<String,String> hs4=new HashMap<>();
        hs4.put("徐熙","安庆");
        array.add(hs4);
        for (HashMap<String, String> map : array) {
            for (String s : map.keySet()) {
                System.out.println(s+"from"+map.get(s));
            }
        }
    }
}