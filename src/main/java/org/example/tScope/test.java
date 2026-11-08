package org.example.tScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("scope=singleton(默认)测试");
        scope_singleton();
        System.out.println("scope=prototype测试");
        scope_prototype();
    }
    public static void scope_singleton(){  //scope默认时，单实例
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        User user = applicationContext.getBean("user1" , User.class);
        User user1 = applicationContext.getBean("user1" , User.class);
        System.out.println(user == user1 ? "一样" : "不一样");  //没设置Scope，默认单实例，拿出，使用，放回同一个对象
    }
    public static void scope_prototype(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        User_prototype userPrototype = applicationContext.getBean("userPrototype" , User_prototype.class);
        User_prototype userPrototype1 = applicationContext.getBean("userPrototype",User_prototype.class);
        System.out.println(userPrototype == userPrototype1 ? "一样" : "不一样");
    }
}
