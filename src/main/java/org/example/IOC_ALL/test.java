package org.example.IOC_ALL;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        try {
            Cat cat = applicationContext.getBean(Cat.class);
            cat.shuchu();
        } catch (BeansException e) {
            System.out.println("cat的bean没生成");
        }
        try {
            Dog dog = applicationContext.getBean(Dog.class);
            dog.shuchu();
        } catch (BeansException e) {
            System.out.println("dog的bean没有生成");
        }
    }
}
