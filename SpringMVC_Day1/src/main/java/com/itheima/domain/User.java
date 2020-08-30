package com.itheima.domain;

import java.util.List;
import java.util.Map;

public class User {
    private String username;
    private int age;
    private Address address;
    private List<Address> list;
    private Map<String,Address> map;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getList() {
        return list;
    }

    public void setList(List<Address> list) {
        this.list = list;
    }

    public Map<String, Address> getMap() {
        return map;
    }

    public void setMap(Map<String, Address> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
