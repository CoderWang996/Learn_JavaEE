package homework4;
/*
请对下列继承代码进行优化和丰富，使得创建子类对象的时候，可以通过有参构造进行初始化，
随后通过getXxx方法获取属性并输出。
运行结果
张三...23
 */
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

class Student extends Person {
    public Student(){
        super();
    }
    public Student(String name,int age){
        super(name,age);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        System.out.println(s.getName()+"..."+s.getAge());
    }
}