package com.spring.course.spring_course;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component("personBean")
public class Person {

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Create Person bean with Pet instance...");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello my lovely " + pet.getClass().getSimpleName());
        pet.say();
    }

}
