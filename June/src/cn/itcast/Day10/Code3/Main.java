package cn.itcast.Day10.Code3;

public class Main {
    public static void main(String[] args) {
        Integer q=100;
        int w=q;
        q=null;
        if(q!=null){
            q+=200;
        }
        //第一种方法
        int j=10;
        String s=j+"";
        int k=Integer.parseInt(s);
        //第二种方法
        String s2=String.valueOf(j);
        int k2=Integer.valueOf(s2);

        double p=3.14;
        String v= String.valueOf(p);
        double p2=Double.valueOf(v);
        double p3=Double.parseDouble(v);
    }
}
