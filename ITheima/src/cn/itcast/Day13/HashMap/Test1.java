package JUNE.src.cn.itcast.Day13.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Student s1=new Student("王晨阳",21);
        Student s2=new Student("徐熙",22);
        Student s3=new Student("任晨",22);
        HashMap<String,Student> hs=new HashMap<>();
        hs.put("001",s1);
        hs.put("002",s2);
        hs.put("003",s3);
        Set<Map.Entry<String, Student>> entries = hs.entrySet();
        for (Map.Entry<String, Student> entry : entries) {//entrySet遍历
            System.out.println(entry);
        }
        Set<String> keySet = hs.keySet();
        for (String s : keySet) {//keySet遍历
            System.out.println(s+"="+hs.get(s));
        }
    }
}