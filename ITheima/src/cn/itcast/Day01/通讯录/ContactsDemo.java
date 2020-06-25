package Day01Code.通讯录;

public class ContactsDemo {
    public static void main(String[] args) {
        contacts c1=new contacts("王晨阳",21,"China","18155719219");
        contacts c2=new contacts("张三",22,"USA","18888888888");
        c1.show();
        c2.show();
        contacts c3=new contacts();
        c3.setName("李四");
        c3.setAge(19);
        c3.setAdress("UK");
        c3.setPhoneNunber("19999999999");
        c3.show();
        System.out.println(c3.getName()+","+c3.getAge()+","+c3.getAdress()+","+c3.getPhoneNunber());
    }
}
