package cn.itcast.Day10.Code8;

public class Main {
    public static void main(String[] args) {
        methond();
    }
    public static void methond(){
        int []arr={1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界啦");
        }
        System.out.println(arr[2]);
    }
}
