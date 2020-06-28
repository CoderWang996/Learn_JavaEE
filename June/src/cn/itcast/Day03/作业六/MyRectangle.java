package cn.itcast.Day03.作业六;
/*
请定义一个描述矩形（MyRectangle）的类，包含宽和高两个属性，
提供获取矩形周长（perimeter）和面积（area）的方法。并编写测试类进行测试。
 */
public class MyRectangle {
    private int height;
    private int width;
        public MyRectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public void perimeter(){
       System.out.println(2*(height+width));
    }
    public void area(){
        System.out.println(height*width);
    }
}
