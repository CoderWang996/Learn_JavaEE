//克隆对象的使用
public class Demo13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("张三", 21);
        Student s2 = s1;
        Student s3 = (Student) s1.clone();
        //浅拷贝
        System.out.println(s1==s2);
        //深拷贝
        System.out.println(s1==s3);
    }
}
