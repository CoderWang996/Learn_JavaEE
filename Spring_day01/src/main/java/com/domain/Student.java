package com.domain;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date birthday;
    private String major;
    private Address address;
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
    public void init1(){
        System.out.println("初始化了！！！");
    }
    public void des1(){
        System.out.println("销毁了！！！");
    }
    public void eat(){
        System.out.println("学生吃鸡腿.....");
    }
    public void study(){
        System.out.println("学IT就来黑马!");
    }
}
