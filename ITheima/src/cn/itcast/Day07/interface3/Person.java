package cn.itcast.Day07.interface3;

public abstract class Person {
    public int AGE;
    public String NAME;

    public Person() {
    }

    public Person(int AGE, String NAME) {
        this.AGE = AGE;
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    public abstract void eat();
}
