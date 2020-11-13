import java.util.Comparator;
import java.util.TreeSet;

//比较器排序Comparator的使用
/*- 存储学生对象并遍历，创建TreeSet集合使用带参构造方法
- 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序*/
public class Demo11 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int n1 = o1.getAge() - o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                int num = n1 == 0 ? n2 : n1;
                return num;
            }
        });
        //创建学生对象
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);

        Student s5 = new Student("linqingxia",33);
        Student s6 = new Student("linqingxia",33);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
