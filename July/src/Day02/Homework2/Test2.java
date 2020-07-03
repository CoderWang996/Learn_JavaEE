package Day02.Homework2;

import java.util.function.Consumer;
//请在主方法中分别调用两个sayHello方法，实现注释中的需求。
public class Test2 {
    public static void main(String[] args) {
        // 对姓名sayHello，即将参数前拼接一个 "hello:"，输出
        sayHello("王晨阳",s -> System.out.println(s+"hello"));
        // 对姓名sayHello输出，并打印姓名的长度
        sayHello("王晨阳",s -> System.out.print(s+"hello"),s -> System.out.println(s.length()));
    }
    // str：要操作的参数，con：行为定义
    public static void sayHello(String str, Consumer<String> con) {
        con.accept(str);
    }
    // str：要操作的参数，con1：行为，con2：滞后的行为
    public static void sayHello(String str, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(str);
    }
}
