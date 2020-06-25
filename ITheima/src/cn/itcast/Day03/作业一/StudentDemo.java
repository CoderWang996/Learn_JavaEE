package 作业一;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Tom");
        s1.setAge(19);
        s1.show();
        Student s2=new Student("Jarry",20);
        s2.show();
    }
}
