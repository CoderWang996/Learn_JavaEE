package Day01.Homework8;
/*
需求：
1:定义一个接口MyInterface，里面有两个抽象方法：        void show1();        void show2();
2:定义接口的两个实现类：        MyInterfaceImplOne        MyInterfaceImplTwo
3:定义测试类：        MyInterfaceDemo        在主方法中，按照多态的方式创建对象并使用
 */
public class Test8 {
    public static void main(String[] args) {
        MyInterface mi=new MyInterfaceImplOne();
        mi.show1();
        mi.show2();
        MyInterface mi2=new MyInterfaceImplTwo();
        mi2.show1();
        mi2.show2();
    }
}
interface MyInterface{
    void show1();
    void show2();
}
class MyInterfaceImplOne implements MyInterface{

    @Override
    public void show1() {
        System.out.println("MyInterfaceImplOne中的show1方法");
    }

    @Override
    public void show2() {
        System.out.println("MyInterfaceImplOne中的show2方法");
    }


}
class MyInterfaceImplTwo implements MyInterface{

    @Override
    public void show1() {
        System.out.println("MyInterfaceImplTwo中的show1方法");
    }

    @Override
    public void show2() {
        System.out.println("MyInterfaceImplTwo中的show2方法");
    }
}