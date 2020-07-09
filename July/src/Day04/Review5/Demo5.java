package Day04.Review5;
//可变参数
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(sum(10,10,10));
        System.out.println(sum(20,20,20));
    }
    public static int sum(int ...a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
