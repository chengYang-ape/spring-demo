package com.yang.diy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三使用注解方式实现aop
@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.yang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==========方法执行前==========");
    }
    @After("execution(* com.yang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("==========方法执行后==========");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理的切入点！
    @Around("execution(* com.yang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("==========环绕前==========");
        //执行方法！
        Signature signature = joinPoint.getSignature();//获得签名!
        System.out.println("signature" + signature);
        Object proceed = joinPoint.proceed();

        System.out.println("==========环绕后==========");
    }

}
