package Day01.Homework9;
/*
    需求：
        1:定义一个接口Inter，里面有三个方法：一个是抽象方法，一个是默认方法，一个是静态方法
            void show();
            default void method(){ }
            public static void test(){ }
        2:定义接口的一个实现类：
            InterImpl
        3:定义测试类：
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class Test9 {
    public static void main(String[] args) {
        Inter inter=new InterImpl();
        inter.method();
        inter.show();
        Inter.test();
    }
}
interface Inter{
    void show();
    default void method(){ }
    public static void test(){ }
}
 class InterImpl implements Inter{

    @Override
    public void show() {
    }
}
