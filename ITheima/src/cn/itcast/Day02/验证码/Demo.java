package 验证码;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
//        生成一个5位数的验证码
//        验证码由 4个 （A-Z a-z） 和1个 （0-9）的字符组成
//        数字固定在最后一位即可- 例如：gAgZ6
        char []arr=new char[52];
        int index=0;
        for(int i='A';i<='Z';i++){
            arr[index]=(char)i;
            index++;
        }
        for(int i='a';i<='z';i++){
            arr[index]=(char)i;
            index++;
        }
        Random r=new Random();
        for (int i=1;i<=4;i++){
            int a=r.nextInt(arr.length);
            char c=arr[a];
            System.out.print(c);
        }
        int b=r.nextInt(10);
        System.out.println(b);
    }
}
