package cn.itcast.Day06.Code3;
/*
定义动物类 属性：年龄，颜色 生成空参有参构造，set和get方法
行为：eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
 */
abstract class Animal {
    public int age;
    public String color;
    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void eat(String something);
}
/*
定义狗类继承动物类，行为：eat(String something)方法,看家lookHome方法(无参数)
 */
class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void eat(String something){
        //2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
        System.out.println(age+"岁的"+color+"的狗两只前腿死死的抱住"+something+"猛吃");
    }
    public void lookHome(){
    }
}

/*
定义猫类继承动物类，行为：eat(String something)方法,逮老鼠catchMouse方法(无参数)
 */
class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void eat(String something){
        //3岁的灰颜色的猫眯着眼睛侧着头吃鱼
        System.out.println(age+"岁的"+color+"的猫眯着眼睛侧着头吃"+"鱼");
    }
    public void catchMouse(){
    }
}

/*
定义Person类 生成空参有参构造，set和get方法 属性：（姓名，年龄）
行为：keepPet( ????? ,String something)方法​
 功能：喂养【宠物狗】和【宠物猫】，问号处自己思考，something表示喂养的东西
 调用keepPet方法，实现运行结果
运行结果：
年龄为30岁的老王养了一只黑颜色的2岁的宠物
 */
class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(Animal animal,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animal.getColor()+"的"+animal.getAge()+"岁的宠物");
        animal.eat(something);
    }
}
/*
定义测试类，使用Perosn对象调用keepPet方法，实现运行结果
运行结果：
年龄为30岁的老王养了一只黑颜色的2岁的宠物
2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
年龄为25岁的老李养了一只灰颜色的3岁的宠物
3岁的灰颜色的猫眯着眼睛侧着头吃鱼
 */
public class Homework1 {
    public static void main(String[] args) {
        Person p1=new Person("老王",30);
        Animal a1=new Dog(2,"黑颜色");
        p1.keepPet(a1,"骨头");
        Person p2=new Person("老李",25);
        Animal a2=new Cat(3,"灰颜色");
        p2.keepPet(a2,"鱼");
    }
}