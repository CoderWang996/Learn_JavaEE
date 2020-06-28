package cn.itcast.Day02.用户登录;

import java.util.Random;
import java.util.Scanner;

/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录。

        验证码由 4个 （A-Z a-z） 和1个 （0-9）的字符组成
        数字固定在最后一位即可- 例如：gAgZ6
        用户输入验证码（不分大小写）用equals进行比对
        如果验证码输入错误，重新生成一个新的验证码，用户再次输入进行比对，直至验证码输入正确
        总共给三次机会，登录之后，给出相应的提示
 */
public class login {
    public static void main(String[] args) {
        String UserNmae = "2701170119";
        String Password = "277710";
        //用char类型的数组存储26个（a-z）和26个（A-Z）的英文字母
        char[] arr = new char[52];
        int index = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            arr[index] = (char) i;
            index++;
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            arr[index] = (char) i;
            index++;
        }
        //如果验证码输入正确，则对用户名和密码进行比对
        //如果验证码输入错误，则重新生成一个随机验证码  直接验证码输入正确（验证码不区分大小写）才能输入用户名和密码
        for (int v = 0; ; v++) {
            Random r = new Random();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                int a = r.nextInt(arr.length);
                sb.append(arr[a]);
            }
            int b = r.nextInt(10);
            sb.append(b);
            String s = sb.toString();
            System.out.println("您的验证码为：" + sb.toString());
            System.out.println("请输入验证码");
            Scanner cin = new Scanner(System.in);
            String yzm = cin.nextLine();
            if (yzm.equalsIgnoreCase(s)) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("请输入用户名");
                    String yhm = cin.nextLine();
                    System.out.println("请输入密码");
                    String mm = cin.nextLine();
                    if (yhm.equals(UserNmae)&&mm.equals(Password)){
                        System.out.println("登陆成功！");
                        break;
                    }else {
                        if (2-i==0){
                            System.out.println("您的账号已被冻结，请与管理员联系！");
                        }else {
                            System.out.println("您的输入有误，您还有"+(2-i)+"次机会");
                        }
                    }
                }
                break;
            }else {
                System.out.println("您输入的验证码有误，请重新输入");
            }
        }
    }
}