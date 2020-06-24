package cn.itcast.Day07.interface2;

public class Cat extends Animal implements jump {
    public Cat(String NAME, int AGE) {
        super(NAME, AGE);
    }

    public Cat() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void junping() {
        System.out.println("猫会跳");
    }
}
