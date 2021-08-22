package com.spring.course.spring_course;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class Person {

    private String surname;
    private int age;
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Create Person bean...");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello my lovely " + pet.getClass().getSimpleName());
        pet.say();
    }

}
