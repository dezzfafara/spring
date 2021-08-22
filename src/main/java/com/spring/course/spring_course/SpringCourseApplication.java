package com.spring.course.spring_course;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCourseApplication {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var person = context.getBean("myPerson", Person.class);
        person.callPet();
        context.close();
    }

}
