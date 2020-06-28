package cn.itcast.Day01.Day1_3Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("王晨阳");
        s.setAge(21);
        s.show();
        System.out.println(s.getName()+","+s.getAge());
    }
}
