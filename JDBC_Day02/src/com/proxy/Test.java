package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        /*stu.eat("米饭");
        stu.study();*/

        /*
            要求：在不改动Student类中任何的代码的前提下，通过study方法输出一句话：来黑马学习
            类加载器：和被代理对象使用相同的类加载器
            接口类型Class数组：和被代理对象使用相同接口
            代理规则：完成代理增强的功能
         */
        StudentInterface proxyStu = (StudentInterface) Proxy.newProxyInstance(stu.getClass().getClassLoader(), new Class[]{StudentInterface.class}, new InvocationHandler() {
            /*
                执行Student类中所有的方法都会经过invoke方法
                对method方法进行判断
                    如果是study，则对其增强
                    如果不是，还调用学生对象原有的功能即可
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("study")) {
                    System.out.println("来黑马学习");
                    return null;
                }else {
                    return method.invoke(stu,args);
                }
            }
        });

        proxyStu.eat("米饭");
        proxyStu.study();

    }
}
