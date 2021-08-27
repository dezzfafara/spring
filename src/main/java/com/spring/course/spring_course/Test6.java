package com.spring.course.spring_course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
       /* var person = context.getBean("personBean", Person.class);
        person.callPet();*/
        Pet cat = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        cat.say();
        var person = context.getBean("personBean", Person.class);
        person.callPet();
        context.close();
    }

}
