package cn.itcast.Day07.interface3;

public class BasketballPlayer extends Player implements StudyEnglish{
    @Override
    public void study() {
        System.out.println("篮球运动员学习如何打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃鸡肉");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(int AGE, String NAME) {
        super(AGE, NAME);
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语不出国");
    }
}
