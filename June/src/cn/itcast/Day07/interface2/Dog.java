package cn.itcast.Day07.interface2;

public class Dog extends Animal implements jump{
    public Dog(String NAME, int AGE) {
        super(NAME, AGE);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    @Override
    public void junping() {
        System.out.println("狗可以跳");
    }
}
