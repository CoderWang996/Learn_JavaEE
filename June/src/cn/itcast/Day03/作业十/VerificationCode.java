package cn.itcast.Day03.作业十;

import java.util.Arrays;
import java.util.Random;

/*
在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
请查看Random、StringBuilder相关API，
定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：
 */
public class VerificationCode {
    public static void main(String[] args) {
        char []arr=new char[62];
        int index=0;
        for (int i='A';i<='Z';i++){
            arr[index]=(char) i;
            index++;
        }
        for (int i='a';i<='z';i++){
            arr[index]=(char) i;
            index++;
        }
        for (int i='0';i<='9';i++){
           arr[index]=(char) i;
           index++;
        }
        for (int i = 0; i < 4; i++) {
            Random r=new Random();
            int a=r.nextInt(arr.length);
            System.out.print(arr[a]);
        }
    }
}