package cn.itcast.Day07.homework7;
/*
定义USB接口:（开启功能）（关闭功能）
定义笔记本类:（开机功能）（关机功能）（定义使用USB设备的功能,要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能）
定义鼠标类:要符合USB接口
定义键盘类:要符合USB接口
定义测试类:创建电脑对象,依次调用开机方法,使用USB设备, 关机方法
运行结果：
笔记本开机
连接鼠标的USB
断开鼠标的USB
连接键盘的USB
断开键盘的USB
笔记本关机
 */
public class Test7 {
    public static void main(String[] args) {
        NoteBook nb=new NoteBook();
        nb.kaiji();
        nb.useUSB();
        nb.shutdown();
    }
}
//定义USB接口:（开启功能）（关闭功能）
interface USB{
    void open();
    void close();
}
//定义鼠标类:要符合USB接口
class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标的USB");
    }
}
//定义键盘类:要符合USB接口
class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("连接键盘的USB");
    }

    @Override
    public void close() {
        System.out.println("断开键盘的USB");
    }
}
//定义笔记本类:（开机功能）（关机功能）（
// 定义使用USB设备的功能,要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能）
class NoteBook{
    public void kaiji(){
        System.out.println("笔记本开机");
    }
    public void shutdown(){
        System.out.println("笔记本关机");
    }
    public void useUSB(){
        new Mouse().open();
        new Mouse().close();
        new KeyBoard().open();
        new KeyBoard().close();
    }
}
