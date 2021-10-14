package com.olegyashcherov.spring.aop;

import com.olegyashcherov.spring.aop.aspects.AroundTestAspect;
import com.olegyashcherov.spring.aop.aspects.LoggingAspect;
import com.olegyashcherov.spring.aop.aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Library library() {
        return new Library();
    }

    @Bean
    public Book book() {return new Book();}

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }

    @Bean
    public AroundTestAspect aroundTestAspect() {return new AroundTestAspect();}
}

