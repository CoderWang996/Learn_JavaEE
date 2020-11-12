abstract class Animal{
    public abstract void eat();
}
class dog extends Animal{
    public void eat() {
        System.out.println("狗吃骨头！");
    }
}
class AnimalOperator{
    public void useAnimal(Animal a){
        a.eat();
    }
    public Animal getAnimal(){
        Animal animal=new dog();
        return animal;
    }
}
//抽象类作为形参和返回值：
  //方法的形参是抽象类名，其实需要的是该抽象类的子类对象
  //方法的返回值是抽象类名，其实需要的还是该抽象类的子类对象
public class Demo2 {
    public static void main(String[] args) {
        AnimalOperator animalOperator = new AnimalOperator();
        Animal animal=new dog();
        animalOperator.useAnimal(animal);
        Animal a2 = animalOperator.getAnimal();
        a2.eat();
    }
}
