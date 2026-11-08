package org.example.Autowried;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Cat cat = applicationContext.getBean("cat" , Cat.class);
        Name name = cat.name;
        name.shuchu();
        cat.fangfa(name);
    }
}
