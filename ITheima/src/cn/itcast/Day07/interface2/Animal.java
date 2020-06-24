package cn.itcast.Day07.interface2;

public abstract class Animal {
    public String NAME;
    public int AGE;

    public Animal(String NAME, int AGE) {
        this.NAME = NAME;
        this.AGE = AGE;
    }

    public Animal() {
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }
    public abstract void eat();
}
