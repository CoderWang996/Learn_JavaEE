package Day01.Homework6;

import java.util.Arrays;
/*
【编号2206】引用某个类型的任意对象的实例方法，组成语法格式：ContainingType::methodName
 例如，有如下需求，请把一个字符串数组中的元素，按照字典顺序排序，但不区分字母的大小写，数组如下：
 String[] stringArray = { "Barbara", "James", "mary", "john", "Patricia", "Robert", "Michael", "Linda" };
 我们知道，这个数组中的字符串对象，都有compareToIgnoreCase 的方法，请使用方法引用实现该需求。
 */
public class Test6 {
    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "mary", "john", "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(stringArray));
    }
}
