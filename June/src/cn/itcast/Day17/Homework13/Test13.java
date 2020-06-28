package cn.itcast.Day17.Homework13;

import java.io.*;

/*
 【编号1905】
 现已知学生实体类（Student），包含姓名和年龄属性。
 请编写程序将若干学生对象保存到当前模块的下的object.txt文件中
 保存成功后，还可以读取文件获取到这些学生对象。
 提示：从文件中读取对象时，与读取其他数据不同，
 readObject方法是通过抛出异常（EOFException）来表示到达文件末尾的，
 所以循环读取多个对象时，可以通过捕获该异常来结束读取。
 除了这种方式还可以怎样比较方便的将多个学生对象只读写一次，以避免此问题？
 */
class Student implements Serializable {
    private String name;
    private int age;
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

}
public class Test13 {
    public static void main(String[] args) throws IOException {
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ITheima\\object.txt"))) {
            Student s1=new Student("王晨阳",21);
            Student s2=new Student("任晨",22);
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.flush();
        }catch (Exception e){

        }
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ITheima\\object.txt"))){
            while (true){
                Student student=(Student)ois.readObject();
                System.out.println(student.getName()+","+student.getAge());
            }
        }catch (Exception e){

        }
    }
}
