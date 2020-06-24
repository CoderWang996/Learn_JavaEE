package cn.itcast.Day10.Homework10;
/*
【编号：1310】请对如下代码进行异常处理，
要求不会影响到后续代码的继续执行，如果程序出现错误，
控制台展示出现的异常名称、异常的原因、异常出现的位置。
运行结果：
java.lang.ArithmeticException: / by zero
	at com.heima.exception.Demo3.main(Demo3.java:6)
    我是程序的后续代码
 */
public class Demo10 {
    public static void main(String[] args) {
        /*
        	-----请对异常进行处理，要求不会影响到后续代码的继续执行-----
        	-----如果程序出现错误，控制台展示出现的异常名称、异常的原因、异常出现的位置-----
        */
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e){
            e.printStackTrace();;
        }
        System.out.println("我是程序的后续代码");
    }
}