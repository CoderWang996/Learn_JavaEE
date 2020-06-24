package cn.itcast.Day07.interface3;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(int AGE, String NAME) {
        super(AGE, NAME);
    }
    public abstract void teach();
    }

