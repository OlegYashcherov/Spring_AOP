package com.olegyashcherov.spring.aop.aspects;

import com.olegyashcherov.spring.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;

@Aspect
@Order(10)
public class LoggingAspect {

    @Before("com.olegyashcherov.spring.aop.aspects.Pointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("*************************************************");
        System.out.println("methodSignature " + methodSignature);
        System.out.println("methodSignature.getMethod() " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() " + methodSignature.getName());

        if (methodSignature.getName().equals("getBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object o : arguments) {
                if (o instanceof String) {
//                    String s = (String) o;
//                    System.out.println("Book info: " + s);
                    System.out.println("Book info: " + o);

                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: Логирование получения");
        System.out.println("*************************************************");

    }


//    @Pointcut("execution (* get*())")
//    private void allGetMethods() {}

//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Логирование получения");
//    }

////    @Pointcut("execution (* return*(*))")
//    @Pointcut("execution (* return*(..))")
//    private void allReturnMethods() {}
//
//    @Pointcut("allGetMethods() || allReturnMethods()")
//    private void allGetAndReturnMethods() {}
//
////    @Before("execution (public void com.olegyashcherov.spring.aop.Library.getBook())")
////    @Before("execution (public void com.olegyashcherov.spring.aop.Library.getBook(String))")
////    @Before("execution (public void com.olegyashcherov.spring.aop.Library.getBook(*))")
////    @Before("execution (public void *(..))")
////    @Before("execution (public void get*())")
////    @Before("execution (public * get*())")
////    @Before("execution (* get*())")
////    @Before("execution (* *())")
//    @Before("allGetMethods()")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetBookNameAdvice() {
//        System.out.println("beforeGetBookNameAdvice: попытка получить наименование книги");
//    }
//
//    @Before("allReturnMethods()")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка сдать книгу");
//    }
//
//    @Before("allGetAndReturnMethods()")
//    public void beforeGetAndReturnBookAdvice() {
//        System.out.println("beforeGetAndReturnBookAdvice: beforeGetAndReturnBookAdvice");
//    }
}
