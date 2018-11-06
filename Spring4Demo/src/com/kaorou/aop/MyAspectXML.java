package com.kaorou.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {

    public void checkPri() {
        System.out.println("权限检查中....");
    }

    public void writeLog() {
        System.out.println("日志记录中....");
    }

    public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("时间记录开始...");
        Object obj = joinPoint.proceed();//执行程序
        System.out.println("时间记录结束...");
        return obj;
    }
}
