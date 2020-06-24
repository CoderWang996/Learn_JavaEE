package JUNE.src.cn.itcast.Day13.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("王晨阳",21);
        Student s2=new Student("徐熙",22);
        Student s3=new Student("任晨",22);
        HashMap<Student,String> hs=new HashMap<>();
        hs.put(s1,"宿州");
        hs.put(s2,"安庆");
        hs.put(s3,"黄山");
        hs.put(s3,"蚌埠");
        Set<Student> students = hs.keySet();
        for (Student student : students) {
            System.out.println(student+"来自"+hs.get(student));
        }
        Set<Map.Entry<Student, String>> entries = hs.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+"来自"+entry.getValue());
        }
    }
}
