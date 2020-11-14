//自动拆装箱
public class Demo14 {
    public static void main(String[] args) {
        int a= 10;
        Integer b=new Integer(10);
        Integer c=Integer.valueOf(10);
        //此过程b自动拆箱了
        System.out.println(a==b);//true
        System.out.println(b==c);//false
        System.out.println(a==c);//true
    }
}
