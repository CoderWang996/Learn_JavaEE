package 作业二;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("Jack");
        t1.setId("1101");
        t1.teach();
        Teacher t2=new Teacher("Tony","12312341");
        t2.teach();
    }
}
