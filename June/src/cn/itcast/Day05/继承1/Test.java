package 继承1;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.eat();
        s.sleep();
        s.Study();
        System.out.println("-------------");
        Teacher t=new Teacher();
        t.eat();;
        t.sleep();
        t.teach();
    }
}
