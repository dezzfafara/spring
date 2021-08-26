package com.spring.course.spring_course;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component("personBean")
public class Person {

    private String surname;
    private int age;
    //@Setter(onMethod = @__({@Autowired}))
    @Autowired
    private Pet pet;

  /*  @Autowired
    public Person(Pet pet) {
        System.out.println("Create Person bean with Pet instance...");
        this.pet = pet;
    }*/

    public void callPet() {
        System.out.println("Hello my lovely " + pet.getClass().getSimpleName());
        pet.say();
    }

}
