package com.qs.logger;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
    public void printLog(){
        System.out.println("增强代码-------");
    }

    public Object around(ProceedingJoinPoint point){
        Object re=null;

        Object[] args = point.getArgs();//获取参数列表

        try {
            System.out.println("前置通知");

            re = point.proceed(args);//执行的方法，需要增强的方法
            System.out.println("后置通知");


        } catch (Throwable throwable) {
            System.out.println("异常通知");

            throwable.printStackTrace();
        }finally {
            System.out.println("最终通知");

        }
        return re;
    }

}
