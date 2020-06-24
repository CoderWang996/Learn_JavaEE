package cn.itcast.Day07.homework8;

//定义动物类 属性:年龄行为:喝水,吃东西【吃什么不确定】
abstract class  Animal{
    public void DrinkWater(){
        System.out.println("喝水");
    }
    public abstract void eat();
}
//定义游泳接口: 行为:游泳方法
interface Swiming{
    void swim();
}
//定义狗类 行为:吃饭(啃骨头)和 游泳(狗刨)
class Dog extends Animal implements Swiming{

    @Override
    public void swim() {
        System.out.println("狗会狗刨游泳");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}
//定义羊类: 行为:吃饭(羊啃草)
class sheep extends Animal{

    @Override
    public void eat() {
        System.out.println("羊啃草");
    }
}
//定义青蛙类: 行为:吃饭(吃虫子)和 游泳(蛙泳)
class frog extends Animal implements Swiming{

    @Override
    public void eat() {
        System.out.println("青蛙吃小虫");
    }

    @Override
    public void swim() {
        System.out.println("青蛙会蛙泳");
    }
}
//定义饲养员类: 行为:饲养动物:包括吃饭和喝水
class AnimalOperator{
    public void KeepAnimal(Animal animal){//Animal animal=new Dog()
        animal.DrinkWater();
        animal.eat();
        if(animal instanceof Dog){
            ((Dog) animal).swim();
        }
        if (animal instanceof frog)
        {
            ((frog) animal).swim();
        }
    }
}
/*
定义测试类: 创建饲养员对象,饲养员调用三次饲养方法:饲养狗,饲养羊,饲养青蛙
要求:
1. 子类重写父类中的吃东西方法
2. 要求给狗和青蛙添加游泳的方法(实现游泳接口)
3. 饲养员类中定义一个方法,传入动物类对象(父类),
4. 调用吃饭方法,如果有游泳方法也需进行测试
运行结果：
喝水
狗啃骨头
狗会狗刨游泳
喝水
青蛙吃小虫
青蛙会蛙泳
喝水
羊啃草
 */
public class Test8 {
    public static void main(String[] args) {
        AnimalOperator ao=new AnimalOperator();
        ao.KeepAnimal(new Dog());
        ao.KeepAnimal(new frog());
        ao.KeepAnimal(new sheep());
    }
}