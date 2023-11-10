package com.sowmik.learnspringframeworkrecap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Sowmik";
    }
    @Bean
    public int age() {
        return 12;
    }
    @Bean
    public Person person() {
        return new Person("Habib", 15);
    }
    @Bean
    public Address address() {
        return new Address("Bazar Road", "Bhurungamari");
    }
}
