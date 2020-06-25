package 作业十;
import java.util.Random;
/*
在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
请查看Random、StringBuilder相关API，
定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：
 */
public class VerificationCode2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (int i = '0'; i <='9' ; i++) {
            sb.append((char) i);
        }
        for (int i = 'A'; i <='Z'; i++) {
            sb.append((char) i);
        }
        for (int i = 'a'; i <='z' ; i++) {
         sb.append((char) i);
        }
        for (int i = 0; i < 4; i++) {
            Random r=new Random();
            sb2.append(sb.charAt(r.nextInt(sb.length())));
        }
        System.out.println("您的验证码为："+sb2.toString());
    }
}