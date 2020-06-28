package cn.itcast.Day07.Test;

//定义一个Human接口
interface Human {
    public default void show() {
        System.out.print("我是一个人 ");
    }
    public abstract void eat();
}
//定义一个Student类
class Student{
    public void show(){
        System.out.print("我是一个学生 ");
    }
    public void eat(){
        System.out.print("学生吃零食 ");
    }
}
//定义一个LittleStudent类，继承Student类并实现Human接口
 class LittleStudent extends Student implements Human {
    public void eat() {
        System.out.print("小学生吃奶粉 ");
    }
}
//定义一个Test测试类
public class Test {
    public static void main(String[] args) {
        LittleStudent lst = new LittleStudent();
        lst.show();
        lst.eat();
    }
}