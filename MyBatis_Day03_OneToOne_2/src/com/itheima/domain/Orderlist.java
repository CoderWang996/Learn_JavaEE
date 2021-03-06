package com.itheima.domain;

public class Orderlist {
    private int id;
    private String number;
    private User u;

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public Orderlist() {
    }

    public Orderlist(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Orderlist{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
