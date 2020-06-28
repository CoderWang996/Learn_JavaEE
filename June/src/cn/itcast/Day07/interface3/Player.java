package cn.itcast.Day07.interface3;

public abstract class Player extends Person{
    public Player() {
    }

    public Player(int AGE, String NAME) {
        super(AGE, NAME);
    }
    public abstract void study();
}
