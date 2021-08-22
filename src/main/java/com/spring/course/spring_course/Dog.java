package com.spring.course.spring_course;

public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Bark-bark!");
    }

    private void init() {
        System.out.println("Init Dog class");
    }

    private void destroy() {
        System.out.println("Destroy Dog class");
    }

}
