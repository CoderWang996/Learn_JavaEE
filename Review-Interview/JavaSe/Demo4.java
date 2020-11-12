interface Inter{
    void method();
}
abstract class Inner{
    abstract void Go();
}
//有一个接口或者抽象类，我们想调用抽象类或接口中的抽象方法，但是又不想创建该抽象类的子类或接口的实现类
//此时可以使用匿名内部类的方式重写抽象方法。
public class Demo4 {
    public static void main(String[] args) {
        new Inter(){
            @Override
            public void method() {
                System.out.println("匿名内部类!");
            }
        }.method();
        new Inner(){
            @Override
            void Go() {
                System.out.println("gogogo!");
            }
        }.Go();
    }
}
