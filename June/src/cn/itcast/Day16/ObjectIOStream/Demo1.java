package cn.itcast.Day16.ObjectIOStream;

import java.io.*;
import java.util.ArrayList;

class Student implements Serializable {
    private String name;
    private transient int age;//用transient修饰的成员变量不参与序列化  当读取它的时候取得默认值
    /*
    ### serialVersionUID&transient【应用】
- serialVersionUID
  - 用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢？
    - 会出问题，会抛出InvalidClassException异常
  - 如果出问题了，如何解决呢？
    - 重新序列化
    - 给对象所属的类加一个serialVersionUID
      - private static final long serialVersionUID = 42L;
- transient
  - 如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
    - 给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程
     */
    private static final long serialVersionUID = 42L;

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

    //重写toString方法
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> arr=new ArrayList<>();
        //ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ITheima\\student.txt"));
        //ObjectInputStream(InputStream in)：创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ITheima\\student.txt"));
        Student s=new Student("王晨阳",21);
        Student s1=new Student("任晨",22);
        Student s2=new Student("徐熙",22);
        arr.add(s);
        arr.add(s1);
        arr.add(s2);
        //void writeObject(Object obj)：将指定的对象写入ObjectOutputStream
        oos.writeObject(arr);
        //释放资源
        oos.close();
        //Object readObject()：从ObjectInputStream读取一个对象
        ArrayList<Student> list=(ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student.getName()+","+student.getAge());
        }
        ois.close();
    }
}