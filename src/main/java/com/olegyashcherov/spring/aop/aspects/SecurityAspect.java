package com.olegyashcherov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(20)
public class SecurityAspect {
    @Before("com.olegyashcherov.spring.aop.aspects.Pointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Проверка доступа");
    }
}
