package JUNE.src.cn.itcast.Day13.Homework5;

import java.util.HashMap;

public class Test05 {
    public static void main(String[] args) {
        String str = "wo ai heima wo ai java wo yao hao hao xue xi java";
        // 将字符串分割为字符串数组，拆分规则为按空格拆分。
        String[] arr = str.split(" +");
        // 创建map集合，以字符串做键，以次数Integer做值
        HashMap<String, Integer> map = new HashMap<>();
        // 遍历数组，获取每个字符串，存入map集合
        for (String s: arr) {
            // 如果存在该键，值加1；如果不存在，值为1
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        // 遍历集合查看结果，按照要求格式输出
        for (String key: map.keySet()) {
            System.out.print(key + "(" + map.get(key) + ")");
        }
    }
}