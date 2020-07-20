package bean;

import java.util.Arrays;

public class Student {
    private String name;
    private String password;
    private String tel;
    private String email;
    private String gender;
    private String birth;
    private String city;
    private String desc;
    private String[] hobby;

    public Student() {
    }

    public Student(String name, String password, String tel, String email, String gender, String birth, String city, String desc, String[] hobby) {
        this.name = name;
        this.password = password;
        this.tel = tel;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.city = city;
        this.desc = desc;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birth='" + birth + '\'' +
                ", city='" + city + '\'' +
                ", desc='" + desc + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
