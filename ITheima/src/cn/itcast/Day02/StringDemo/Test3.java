package StringDemo;

import java.util.Scanner;

/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

    思路：
        1:已知用户名和密码，定义两个字符串表示即可
        2:键盘录入要登录的用户名和密码，用 Scanner 实现
        3:拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
        4:用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
 */
public class Test3 {
    public static void main(String[] args) {
        String username="2701170119";
        String password="277710";

        for (int i=0;i<3;i++){
            Scanner cin=new Scanner(System.in);
            System.out.println("请输入用户名");
            String use=cin.nextLine();
            System.out.println("请输入密码");
            String psw=cin.nextLine();
            if(use.equals(username)&&psw.equals(password)){
                System.out.println("登录成功");
                return;
            }else {
                if(2-i==0){
                    System.out.println("你的账号已冻结");
                }else{
                    System.out.println("你的输入有误，你还有"+(2-i)+"次机会");
                }
            }
        }
}
}
