package cn.itcast.Day10.Homework9;
/*
【编号：1309】请在补齐代码，将try语句中可能出现问题得异常对象，
全部进行捕获，捕获的顺序不限制，最终要求控制台输出
【捕获数组索引越界异常】
运行结果：
捕获数组索引越界异常
 */
public class Demo9 {
    /*
       -----请编写代码，将可能会出现的异常全部进行捕获-----
    */
    public static void main(String[] args){
        try{
            String[] arr = {"abc","bbc","ccc"};
            System.out.println(arr[10]);
            arr=null;
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获数组索引越界异常");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获空指针异常");
        }
    }
}