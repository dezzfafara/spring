package com.spring.course.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        var dog1 = context.getBean("dog", Dog.class);
        var dog2 = context.getBean("dog", Dog.class);
        context.close();
    }

}
