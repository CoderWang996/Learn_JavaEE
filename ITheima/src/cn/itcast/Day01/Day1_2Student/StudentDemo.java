package Day01Code.Day1_2Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="王晨阳";
        s.age=21;
        System.out.println(s.name+","+s.age);
        s.study();
        s.HomeWork();
        Student s2=s;
        s2.name="任晨";
        s2.age=22;
        System.out.println(s.name+","+s.age);
        System.out.println(s2.name+","+s2.age);
    }
}
