package cn.itcast.Day07.Code4;

public class AnimalOperator {
    public void useAnimal(Animal a){
        a.eat();
    }
    public Animal getAnimal(){
        return new Cat();
    }
}
