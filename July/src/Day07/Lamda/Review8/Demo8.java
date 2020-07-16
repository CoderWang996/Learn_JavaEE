package Day07.Lamda.Review8;
/*
练习描述
- 定义一个类(Student)，里面有两个成员变量(name,age)
  并提供无参构造方法和带参构造方法，以及成员变量对应的get和set方法
- 定义一个接口(StudentBuilder)，里面定义一个抽象方法
  Student build(String name,int age);
- 定义一个测试类(StudentDemo)，在测试类中提供两个方法
  - 一个方法是：useStudentBuilder(StudentBuilder s)
  - 一个方法是主方法，在主方法中调用useStudentBuilder方法
 */
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
interface StudentBuilder{
    Student build(String name,int age);
}
public class Demo8 {
    public static void main(String[] args) {
        useStudentBuilder(Student::new);
    }
    private static void useStudentBuilder(StudentBuilder s){
        System.out.println(s.build("王晨阳",21).getName()+","+s.build("王晨阳",21).getAge());
    }
}
