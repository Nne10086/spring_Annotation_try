package org.example.Bean_PostConstruct_PreDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        Cat cat = annotationConfigApplicationContext.getBean(Cat.class);
        annotationConfigApplicationContext.close();
    }
}
