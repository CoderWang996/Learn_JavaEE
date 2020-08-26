package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class TransationApp {
    public void open(JoinPoint jp){
        Signature signature = jp.getSignature();
        //获取方法名
        String name = signature.getName();
        //获取目标对象
        Object target = jp.getTarget();
        System.out.println("开启事务。。。。"+name+"---"+target);
    }
    public void commit(){
        System.out.println("提交事务。。。。");
    }
    public void rollback(){
        System.out.println("回滚事务。。。。");
    }
    public void close(){
        System.out.println("释放资源。。。。");
    }
    //环绕通知
    public void around(ProceedingJoinPoint pp){
        //继续执行目标方法
        try {
            System.out.println("前置通知");
            //获取方法名
            String name = pp.getSignature().getName();
            System.out.println(name);
            pp.proceed();
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        }finally {
            System.out.println("最终通知");
        }
    }
}
