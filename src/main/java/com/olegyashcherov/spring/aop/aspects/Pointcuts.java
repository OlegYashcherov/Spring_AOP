package com.olegyashcherov.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution (* abc*(..))")
//    @Pointcut("execution (* get*(..))")
    public void allGetMethods() {
    }
}
