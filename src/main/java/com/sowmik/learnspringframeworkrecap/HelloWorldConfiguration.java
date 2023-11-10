package com.sowmik.learnspringframeworkrecap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
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
        return new Person("Habib", 15, new Address("Paglarhat Road", "Shiliguri"));
    }
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
    @Bean(name = "address2")
    public Address address() {
        return new Address("Bazar Road", "Bhurungamari");
    }
    @Bean(name = "address3")
    public Address address3() {
        return new Address("Bazar Road", "Bhurungamari");
    }
}
