package org.example.Bean_init_destory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("容器创建完成");
        Car car = applicationContext.getBean(Car.class);
        applicationContext.close();
    }
}
