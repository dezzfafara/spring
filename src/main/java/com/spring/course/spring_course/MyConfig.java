package com.spring.course.spring_course;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.spring.course.spring_course")
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
