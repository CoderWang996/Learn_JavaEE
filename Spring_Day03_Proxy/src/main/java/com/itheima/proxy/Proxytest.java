package com.itheima.proxy;

import com.itheima.service.StudentService;
import com.itheima.service.impl.RoleServiceImplement;
import com.itheima.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxytest {
    //jdk动态代理
    //基于接口，代理对象和目标对象拥有共同的接口
    @Test
    public void test1() {
        //创建目标对象
        final StudentServiceImpl studentService = new StudentServiceImpl();
        //创建代理对象
        StudentService service = (StudentService) Proxy.newProxyInstance(studentService.getClass().getClassLoader(),
                studentService.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object obj = null;
                        String methodName = method.getName();
                        if ("findAll".equals(methodName)) {
                            obj = method.invoke(studentService, args);
                        } else {
                            System.out.println("事务开启了....");
                            obj = method.invoke(studentService, args);
                        }
                        return obj;
                    }
                });
//        service.save();
//        service.findAll();
        service.update(12);
    }
    //Cglib动态代理：基于父类
    @Test
    public void test2(){
        //目标对象
        final RoleServiceImplement roleServiceImplement = new RoleServiceImplement();//必须用final修饰否则匿名内部类访问不到
        RoleServiceImplement rs = (RoleServiceImplement) Enhancer.create(roleServiceImplement.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("事务开启了....");
                return method.invoke(roleServiceImplement, objects);
            }
        });
        rs.save();
        System.out.println(rs);
    }
}
