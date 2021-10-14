package com.olegyashcherov.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundTestAspect {

    @Around("execution (public String returnBook(..))")
    public Object testAroundAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Попытка");
        Object targetMethodResult = joinPoint.proceed();
        System.out.println("Подмена результата");
        targetMethodResult = "Турецкий гамбит";

        System.out.println("Успех");
        return targetMethodResult;
    }
}
