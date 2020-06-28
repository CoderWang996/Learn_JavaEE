package cn.itcast.Day06.Code2;

/*
【编号：1202】请补充下列代码，在main方法中调用method方法，并编译通过，
最终在控制台输出（狗吃肉，狗看家）
运行结果：
狗吃肉
狗看家
 */
public class Demo2 {
    public static void main(String[] args) {
        // 请在此处调用method方法
        Animal a=new Dog();
        method(a);
    }

    public static void method(Animal a) {
        a.eat();
        if(a instanceof Dog){
            ((Dog) a).watchHome();
        }
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome() {
        System.out.println("狗看家");
    }
}