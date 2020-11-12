class Fu {
    public int age=40;

    public Fu(int age) {
        this.age = age;
    }

    public Fu() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("父吃蔬菜！");
    }
}

class Zi extends Fu{
    public int age=20;
    public String name="小王";

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("儿子吃肉！");
    }
    public void sing(){
        System.out.println("儿子会唱歌！");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        fu.eat();
        int age = fu.age;
        System.out.println("父亲的年龄为："+age);
        System.out.println("--------向下转型---------");
        Zi zi=(Zi) fu;
        zi.sing();
        System.out.println("儿子的年龄为："+zi.age);
        System.out.println("儿子的名字为："+zi.name);
        zi.eat();
    }
}
