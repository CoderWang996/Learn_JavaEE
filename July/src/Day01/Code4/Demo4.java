package Day01.Code4;

public class Demo4 {
    public static void main(String[] args) {
        Useconverse(s->Integer.parseInt(s));
        Useconverse(Integer::parseInt);
    }
    public static void Useconverse(converse converse){
        int num=converse.converse("888");
        System.out.println(num);
    }

}
