package Day01.Lambda;

public class Demo1 {
    public static void main(String[] args) {
        WuXuChen w=new WuXuChen();
        w.Sleep();
        useChenChu(new ChenChu() {
            @Override
            public void Sleep() {
                System.out.println("匿名内部类，睡觉睡觉！");
            }
        });
        useChenChu(()-> System.out.println("Lambda,睡觉！"));
    }
    public static void useChenChu(ChenChu c){
        c.Sleep();
    }
}
