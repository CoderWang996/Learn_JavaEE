//hashCode
class Student {
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

    @Override
    public int hashCode() {
        return 0;
    }
}
public class Demo9 {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("林青霞",30);
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode()); //1060830840
        System.out.println(s1.hashCode()); //1060830840
        System.out.println("--------");
        Student s2 = new Student("林青霞",30);
        //默认情况下，不同对象的哈希值是不相同的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode()); //2137211482
        System.out.println("--------");
        //hash碰撞
        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395
    }
}
