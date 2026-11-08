package org.example.Bean_PostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Cat cat = applicationContext.getBean(Cat.class);
        cat.shuchu();
        applicationContext.close();
    }
}
