package cn.itcast.Day08.API_System;

public class Test {
    public static void main(String[] args) {
        long Start=System.currentTimeMillis();
        for (int i = 0; i <= 12; i+=4) {
            for (int j = 4; j <=25 ; j+=7) {
                for (int k = 75; k <=84 ; k+=3) {
                    if((5*i+3*j+k/3)==100&&(i+j+k)==100&&k%3==0){
                        System.out.println("公鸡"+i+"只，母鸡"+j+"只，小鸡"+k+"只");
                    }
                }
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("用时"+(end-Start)+"毫秒");
    }
}
