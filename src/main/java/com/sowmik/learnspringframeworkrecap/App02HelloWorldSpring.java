package com.sowmik.learnspringframeworkrecap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want spring to manage @Configuration
        // name -@Bean
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(HelloWorldConfiguration.class).name());
        //System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person3Parameters"));
    }
}
