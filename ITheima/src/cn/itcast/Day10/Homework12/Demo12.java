package cn.itcast.Day10.Homework12;
/*
【编号：1312】某程序员编写了一个方法，该方法实现的逻辑是从传入的数组中找出最大值，
但考虑到调用者可能会传入一个长度为0的数组，所以要给调用者进行相应的提示，
但是Java中并没有合适的异常类名可以直观的让调用者明白出现的问题，
该程序员想自己设计一个运行时异常ArrayLengthNotZeroException，为自己的方法提供服务，请帮其实现功能
 */
public class Demo12 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int max = getMax(arr);
        System.out.println("最大值为：" + max);
    }

    public static int getMax(int[] arr){
        if(arr.length == 0){
            // 抛出ArrayLengthNotZeroException运行时异常，传入异常信息
            throw new ArrayLengthNotZeroException("数组长度不能为0");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
// 定义运行时异常类，继承RuntimeException
class ArrayLengthNotZeroException extends RuntimeException {
    public ArrayLengthNotZeroException() {
    }
    // 提供有参构造，内部将异常信息，通过super让父类帮忙初始化
    public ArrayLengthNotZeroException(String message) {
        super(message);
    }
}