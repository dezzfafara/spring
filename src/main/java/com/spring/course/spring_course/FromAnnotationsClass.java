package com.spring.course.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FromAnnotationsClass {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        var person = context.getBean("personBean", Person.class);
        person.callPet();
        context.close();
    }

}