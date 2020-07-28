package bean;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int score;
    public Student() {
    }

    public Student(String name, int age, String gender, int score) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name+","+age+","+gender+","+score;
    }
}
