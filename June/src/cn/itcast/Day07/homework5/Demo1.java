    package cn.itcast.Day07.homework5;
    /*
    【编号：1101】请在main方法中通过多态创建对象，
    随后使用对象，使得程序符合最终运行结果
    运行结果：
    10
    子类的method方法
    子类的show方法
     */
    public class Demo1 {
        /*
            请在main方法中通过多态创建对象，随后使用对象，使得程序符合最终运行结果
         */
        public static void main(String[] args) {
            Fu fu=new Zi();
            System.out.println(fu.num);
            if (fu instanceof Zi){
                ((Zi) fu).method();
                ((Zi) fu).show();
            }
        }
    }

    class Fu {
       int num = 10;
        public void method(){
            System.out.println("父类的method方法");
        }
    }

    class Zi extends Fu{
        int num = 20;

        public void method(){
            System.out.println("子类的method方法");
        }

        public void show(){
            System.out.println("子类的show方法");
        }
    }