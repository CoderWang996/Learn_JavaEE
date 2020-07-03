package Day02.Predicate;

import java.util.function.Predicate;

public class PredicateDemo02 {
    public static void main(String[] args) {
        //当有true时就返回true,两者都为false则为false
        boolean b1=checkString("年好呀",s -> s.length()==3,s -> s.length()>8);//true
        System.out.println(b1);
        boolean b2=checkString("I love a beautiful girl666",s->s.length()<8,s -> s.equals(888));//false
        System.out.println(b2);
    }
    //同一个字符串给出两个不同的判断条件，最后把这两个判断的结果做逻辑与运算的结果作为最终的结果
    private static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        //逻辑或
        return pre1.or(pre2).test(s);
    }
}
