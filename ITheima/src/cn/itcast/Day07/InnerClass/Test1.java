package cn.itcast.Day07.InnerClass;

public class Test1 {
    private static int num=10;
    public void show(){
        System.out.println("外部类show");
    }
    public static class inner{
        public void method(){
            System.out.println(num);
          Test1 t=new Test1();
          t.show();
        }
    }

    public static void main(String[] args) {
        new inner().method();
    }
}
