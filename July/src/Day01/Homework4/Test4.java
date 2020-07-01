package Day01.Homework4;
/*
假设有一个函数式接口StringInter，在测试类中，有一个方法StringOperate，
要求在主方法中调用StringOperate方法，可以获取反转后的字符串，
我们同样可以采用匿名内部类的方式实现这个接口，但材料中已经有一个字符串操作类实现了这个功能，
请使用方法引用改进注释掉的代码部分，实现需求。
 */
public class Test4 {
    public static void main(String[] args) {
        String str = "this is a function reference test";
        // 调用方法，获取反转的结果
        /*
        String revStr = StringOperate(new StringInter(){
            @Override
            public String func(String str) {
                return new StringBuilder(str).reverse().toString();
            }
        }, str);
        */
        // 请使用方法引用改写
        String revStr=StringOperate(MyStringOps::strReverse,str);
        System.out.println("str: " + str);
        System.out.println("revStr: " + revStr);
    }
    // 在主方法中调用该方法，得到反转的字符串
    public static String StringOperate(StringInter si, String str) {
        return si.func(str);
    }
}
// 函数式接口
interface StringInter {
    String func(String str);
}

// 一个字符串操作类
class MyStringOps {
    // 反转字符串的静态方法
    public static String strReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}