package StringBuilder;

import java.util.stream.Stream;

/*
    StringBuilder 转换为 String
        public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String

    String 转换为 StringBuilder
        public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
 */
public class Test2{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("1234");
        String s=sb.toString();
        String s2="112233";
        StringBuilder sb2=new StringBuilder(s2);
        System.out.println(s);
        System.out.println(sb2);
    }
}