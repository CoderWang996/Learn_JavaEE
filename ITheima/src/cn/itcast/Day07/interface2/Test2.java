package cn.itcast.Day07.interface2;

public class Test2 {
    public static void main(String[] args) {
        Cat c=new Cat("汤姆",4);
        System.out.println(c.getNAME()+","+c.getAGE());
        c.junping();
        c.eat();
        Dog d=new Dog("小点点",1);
        System.out.println(d.getNAME()+","+d.getAGE());
        d.junping();
        d.eat();
        jump j=new Cat();
        Animal a=new Dog();
        AnimalOperator ao=new AnimalOperator();
        ao.useAnimal(j);
        ao.useAnimal(a);
    }
}
