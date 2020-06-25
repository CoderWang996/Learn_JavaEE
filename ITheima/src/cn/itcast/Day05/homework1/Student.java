package homework1;
/*
观察发现，这两个类的结构太接近了，后者比前者仅多了一个属性，却需要重复定义其他内容。
请根据类的继承机制，帮助小李重新设计Student类。并测试获取Student对象的属性信息。
 */
public class Student extends Person{
    private String school; // 所在学校
    public Student(){}
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student(String name, int age, String birthday, String schol){
        super(name,age,birthday);
        this.school=schol;
    }
    // 获取信息的方法
    public String getInfo() {
        return "Student[name=" + super.getName()+ ", age=" + super.getAge()+ ", birthday=" + super.getBirthday() + ", school=" + school + "]";
    }
}