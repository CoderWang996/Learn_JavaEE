package cn.itcast.Day08.Code3;
interface Jump{
    void fly();
}
class Animal{
    public void method(Jump j){
        j.fly();
    }
}
public class Test3 {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.method(new Jump() {
            @Override
            public void fly() {
                System.out.println("风口来了，猪都能飞！");
            }
        });
        a.method(new Jump() {
            @Override
            public void fly() {
                System.out.println("猫飞不了");
            }
        });
    }
}
