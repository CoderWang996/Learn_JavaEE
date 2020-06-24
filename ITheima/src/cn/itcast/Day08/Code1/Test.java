package cn.itcast.Day08.Code1;

interface Iner{
    void show();
}
public class Test {
    public static void main(String[] args) {
        new Iner() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
    }

}
