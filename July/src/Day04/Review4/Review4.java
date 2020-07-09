package Day04.Review4;

import java.util.Scanner;

class ScoreException extends Exception{
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
class Teacher{
    public void checkScore(int score)throws ScoreException{
        if(score<0||score>120){
            throw new ScoreException("分数有误！");
        }else {
            System.out.println("分数正常");
        }
    }
}
public class Review4 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请录入您的分数：");
        int s=cin.nextInt();
        Teacher t=new Teacher();
        try {
            t.checkScore(s);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
