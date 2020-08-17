package com.itheima.domain.system;

import java.util.Date;

public class User {
    private String id;
    private String email;       //邮箱
    private String userName;    //姓名
    private String password;    //密码
    private Long state;         //状态
    private String gender;      //性别
    private String telephone;   //电话
    private String birthday;      //出生年月
    private String joinDate;      //入职时间
    private String deptId;      //部门id

    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public User(String id, String email, String userName, String password, Long state, String gender, String telephone, String birthday, String joinDate, String deptId, Dept dept) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.state = state;
        this.gender = gender;
        this.telephone = telephone;
        this.birthday = birthday;
        this.joinDate = joinDate;
        this.deptId = deptId;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                ", birthday=" + birthday +
                ", joinDate=" + joinDate +
                ", deptId='" + deptId + '\'' +
                ", dept=" + dept +
                '}';
    }
}
