package org.example.Conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Person person1 = applicationContext.getBean("person" , Person.class);
        System.out.println("谁是老大");
        System.out.println(person1.getName());
    }
}
