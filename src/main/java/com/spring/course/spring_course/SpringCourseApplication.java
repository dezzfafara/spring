package com.spring.course.spring_course;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCourseApplication {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var pet = context.getBean("myPet", Pet.class);
        var person = new Person(pet);
        person.callPet();
        context.close();
    }

}
