package 继承三;

public class Zi  extends Fu {
    public Zi(){
        super();//JVM会默认给这句话，可写可不写
        System.out.println("子类中的无参构造");
    }
    public Zi(int age){
        super(4);//子类继承父类带参需要用super（参数）；
        System.out.println("子类中的有参构造");
    }
    }