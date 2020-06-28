package 继承四;

public class Zi extends Fu {
    public void methed(){
        System.out.println("子类中的methed");
    }
    public void show(){
        super.show();
        System.out.println("子类中的show");
    }
}
