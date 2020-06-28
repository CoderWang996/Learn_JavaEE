package cn.itcast.Day12.Generic;
class Generic<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class Main {
    public static void main(String[] args) {
        Generic<Integer> g1=new Generic<>();
        g1.setT(10);
        System.out.println(g1.getT());
        Generic<String> g2=new Generic<>();
        g2.setT("图灵网络");
        System.out.println(g2.getT());
    }
}
