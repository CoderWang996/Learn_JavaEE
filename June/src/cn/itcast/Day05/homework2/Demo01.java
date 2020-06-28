package homework2;
/*
运行结果：
我是父类的method方法
我是子类的method方法
 */
class Fu {
    public void methodFu(){
        System.out.println("我是父类的method方法");
    }
}

class Zi extends Fu {
    @Override
    public void methodFu(){
        super.methodFu();
    }
    public void methodZi(){
        System.out.println("我是子类的method方法");
    }
}
public class Demo01{
    public static void main(String[] args) {
        Zi z=new Zi();
        z.methodFu();
        z.methodZi();
    }
}