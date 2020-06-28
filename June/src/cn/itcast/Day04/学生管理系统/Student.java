package cn.itcast.Day04.学生管理系统;
/*
学生类
 */
public class Student {
    //学号
    private String sid;
    //姓名
    private String name;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //年龄
    private int age;
    //住址
    private String address;
    public Student(){ }
    public Student(String sid,String name,int age,String address){
        this.sid=sid;
        this.name=name;
        this.age=age;
        this.address=address;
    }

}
