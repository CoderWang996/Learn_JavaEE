package Day01Code.Day1_1Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p=new Phone();
        System.out.println(p.brabd);
        System.out.println(p.price);
        p.brabd="华为";
        p.price=4399;
        System.out.println(p.brabd);
        System.out.println(p.price);
        p.call();
        p.sendMessage();
    }
}
