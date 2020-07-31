package 动态代理.Demo01;

import 动态代理.Demo01.StuInterface;
import 动态代理.Demo01.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        StuInterface sif= (StuInterface) Proxy.newProxyInstance(student.getClass().getClassLoader(), new Class[]{StuInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("Study")) {
                    System.out.println("来黑马学习");
                    return null;
                } else {
                    return method.invoke(student, args);
                }
            }
        });
        student.eat("米饭");
        student.Study();
        System.out.println("------------------------------");
        sif.eat("米饭");
        sif.Study();
    }
}
