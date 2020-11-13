import java.util.TreeSet;

//自然排序Comparable的使用
class Stu implements Comparable<Stu>{
    private String name;
    private int age;

    public Stu() {
    }

    public Stu(String name, int age) {
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
    public int compareTo(Stu stu) {
        //按照年龄从小到大排序
        int n1=this.age-stu.age;
        //按照姓名的字母顺序排序
        int n2 = this.name.compareTo(stu.name);
        int n=n1==0?n2:n1;
        return n;
    }
}
public class Demo10 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Stu> ts = new TreeSet<Stu>();

        //创建学生对象
        Stu s1 = new Stu("xishi", 29);
        Stu s2 = new Stu("wangzhaojun", 28);
        Stu s3 = new Stu("diaochan", 30);
        Stu s4 = new Stu("yangyuhuan", 33);

        Stu s5 = new Stu("linqingxia",33);
        Stu s6 = new Stu("linqingxia",33);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for (Stu s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
