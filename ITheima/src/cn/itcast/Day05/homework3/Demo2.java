package homework3;
/*
运行结果：
30
20
10
 */
class Fu {
    public int num=10;
}

class Zi extends Fu{
    int num = 20;
    public void method(){
        int num = 30;
        // 这里要求输出30
        System.out.println(num);
        // 这里要求输出20
        System.out.println(this.num);
        // 这里要求输出10
        System.out.println(super.num);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }
}