package com.itheima.domain;

/*
    学生实体类
 */
public class Student {
    private String number;  //学号
    private String name;    //姓名
    private String birthday;  //生日
    private String address; //地址

    public Student() {
    }

    public Student(String number, String name, String birthday, String address) {
        this.number = number;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
