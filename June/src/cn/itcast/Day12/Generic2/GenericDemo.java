package cn.itcast.Day12.Generic2;
class Generic{
    public <T> void show(T t){
        System.out.println(t);
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Generic g=new Generic();
        g.show("我今年");
        g.show(21);
        g.show(true);
    }
}
