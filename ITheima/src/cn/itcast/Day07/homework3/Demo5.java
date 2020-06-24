package cn.itcast.Day07.homework3;
/*
 1-1000之间的偶数和为：250500
methodA的执行时间为：28
 */
public class Demo5 {
    public static void main(String[] args) {
        /*
        	-----计算methodA方法执行了多长时间?-----
        */
        long startTime=System.currentTimeMillis();
        methodA();
        long endTime=System.currentTimeMillis();
        System.out.println("methodA的执行时间为："+(endTime-startTime)+"毫秒");
    }

    public static void methodA() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-1000之间的偶数和为：" + sum);
    }
}