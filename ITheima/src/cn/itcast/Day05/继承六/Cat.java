package 继承六;

public class Cat extends Animal{
    public Cat(){
        super();
    }
    public Cat(String name,int age){
        super(name,age);
    }
    public void CatchMouse(){
        super.eat();
        System.out.println("抓老鼠");
    }
}
