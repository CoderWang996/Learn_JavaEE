package cn.itcast.Day18.BoxMilk;

public class Box {
    public int milk;
    public boolean state=false;
    public void put(int milk){
            this.milk=milk;
        System.out.println("送奶工正在送第"+milk+"瓶奶");
    }
    public void get(){
        System.out.println("少公子正在喝第"+milk+"瓶奶");
    }
}
