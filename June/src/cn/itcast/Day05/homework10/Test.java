package homework10;

import sun.applet.resources.MsgAppletViewer_es;

public class Test {
    public static void main(String[] args) {
        Person p=new SuperMan();
        p.eat();
        p.work();
        SuperMan sp=(SuperMan)p;
        sp.save();
    }
}
