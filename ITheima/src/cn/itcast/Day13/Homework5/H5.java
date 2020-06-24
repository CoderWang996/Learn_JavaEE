package JUNE.src.cn.itcast.Day13.Homework5;

import java.util.*;

/*
【编号：1605】现获取到一段文本，如下：
wo ai heima wo ai java wo yao hao hao xue xi java
单词间以空格分隔，请编写程序统计这段文本中每个单词出现的次数。输出格式如下：
xi(1)java(2)yao(1)hao(2)wo(3)ai(2)heima(1)xue(1)
 */
public class H5 {
    public static void main(String[] args) {
        String s="wo ai heima wo ai java wo yao hao hao xue xi java";
        String []arr=s.split(" ");
        HashMap<String,Integer> tm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key=arr[i];
            Integer value=tm.get(key);
            if(value==null){
                tm.put(key,1);
            }else {
                value++;
                tm.put(key,value);
            }
        }
        Set<Map.Entry<String, Integer>> entries = tm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getKey()+"("+entry.getValue()+")");
        }
    }
}
