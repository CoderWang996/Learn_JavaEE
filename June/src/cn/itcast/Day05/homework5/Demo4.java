package homework5;
/*
某手机系统5版本的时候，引入了【语音助手】的功能，但最开始的【语音助手】只能说英文，后期版本更新到6版本的时候，
【语音助手】才能够在说英文的基础上又会说中文，请结合继承的思想，
对下列代码进行补充，最终在控制台上输出（speak english）（说中文）
运行结果：
speak english
说中文
 */
class PhoneVersion5{
    public void speak(){
        System.out.println("speak english");
    }
}

class PhoneVersion6 extends PhoneVersion5 {
    public void speak(){
        super.speak();
        System.out.println("说中文");
    }

}

public class Demo4 {
    public static void main(String[] args) {
        PhoneVersion6 pv6 = new PhoneVersion6();
        pv6.speak();
    }
}