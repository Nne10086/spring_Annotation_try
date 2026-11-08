package org.example.AOP_try;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect  //告诉spring这是切面类
//切面类（增强逻辑）
public class yewu {
    @Before(value = "execution(* org.example.AOP_try.Cat.fangfa(..))")  //切入点表达式（切入的目标）
    public void a1(){
        System.out.println("前置通知");
    }


    @Pointcut("execution(* org.example.AOP_try.Cat.fangfa(..))")  //公共切入点表达式
    public void pointcut(){}

    @After("pointcut()")
    public void a2(){
        System.out.println("后置通知");
    }

    @Around("pointcut()")
    public void a3(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前置通知");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后置通知");
    }
}
