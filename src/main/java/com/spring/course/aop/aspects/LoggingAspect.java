package com.spring.course.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get book...");
    }

}
