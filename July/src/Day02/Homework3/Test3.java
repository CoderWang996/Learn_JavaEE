package Day02.Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//请使用Collection中的removeIf方法实现注释中的需求。
public class Test3 {
    public static void main(String[] args) {
        List<String> list = List.of("java", "JAVAse", "javaee", "html", "css", "JavaScript");
        ArrayList<String> strs = new ArrayList<>();
        strs.addAll(list);
        // 将集合strs中凡是以"java"开头（不区分大小写）的元素删除
        strs.removeIf(s -> s.toLowerCase().startsWith("java"));
        strs.forEach(System.out::println);

    }
}