package 继承六;

public class Test {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.setName("Tom");
        c1.setAge(5);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.CatchMouse();
        Cat c2=new Cat("Jim",6);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.CatchMouse();
    }
}
