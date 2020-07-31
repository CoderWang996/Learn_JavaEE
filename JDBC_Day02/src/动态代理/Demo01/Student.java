package 动态代理.Demo01;

public class Student implements StuInterface {
    public void eat(String thing){
        System.out.println("学生吃"+thing);
    }
    public void Study(){
        System.out.println("在家自学");
    }
}
