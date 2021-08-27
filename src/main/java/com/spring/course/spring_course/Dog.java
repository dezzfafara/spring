package com.spring.course.spring_course;

import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Bark-bark!");
    }

    @PostConstruct
    private void init() {
        System.out.println("Init Dog class");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Destroy Dog class");
    }

}
