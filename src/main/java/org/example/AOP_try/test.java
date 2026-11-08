package org.example.AOP_try;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Cat cat = applicationContext.getBean("cat" , Cat.class);
        cat.fangfa();
    }

}
