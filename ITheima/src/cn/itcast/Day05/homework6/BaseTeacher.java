package homework6;
/*
 现有基础班老师（BaseTeacher），都含有姓名和年龄两个属性，
 基础班老师的teach方法输出【基础班老师讲JavaSE】
 */
public class BaseTeacher {
    //含有姓名和年龄两个属性
    public String name;
    public int age;
    public BaseTeacher(){}

    public BaseTeacher(String name, int age) {
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
    public void teach(){
        System.out.println("基础班老师讲JavaSE");
    }
}
