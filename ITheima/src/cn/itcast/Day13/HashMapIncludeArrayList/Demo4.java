package JUNE.src.cn.itcast.Day13.HashMapIncludeArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm=new HashMap<>();
        ArrayList<String> arr=new ArrayList<>();
        arr.add("唐僧");
        arr.add("猪八戒");
        hm.put("西游记",arr);
        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("西门庆");
        arr2.add("潘金莲");
        hm.put("水浒传",arr2);
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            System.out.println(entry.getKey()+"包含"+entry.getValue());
        }
    }
}
