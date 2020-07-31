package com.proxy;

public class Student implements StudentInterface{
    public void eat(String name) {
        System.out.println("学生吃" + name);
    }

    public void study() {
        System.out.println("在家自学");
    }
}
