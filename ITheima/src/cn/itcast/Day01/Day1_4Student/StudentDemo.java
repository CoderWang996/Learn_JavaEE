package Day01Code.Day1_4Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.show();
        Student s2=new Student("王晨阳");
        s2.show();
        Student s3=new Student(21);
        s3.show();
        Student s4=new Student("王晨阳",21);
        s4.show();
    }
}