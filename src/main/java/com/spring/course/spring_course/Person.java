package com.spring.course.spring_course;

import lombok.Getter;

@Getter
public class Person {

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello my lovely " + pet.getClass().getSimpleName());
        pet.say();
    }

}
