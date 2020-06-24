package cn.itcast.Day08.Code2;

interface Jumpping{
    void jump();
}

class AnimalOperator{
    public void keepAnimal(){
        new Jumpping(){
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        }.jump();
    }
}
public class Test2 {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        ao.keepAnimal();
    }
}
