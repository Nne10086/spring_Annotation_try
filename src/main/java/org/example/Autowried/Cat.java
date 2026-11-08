package org.example.Autowried;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {
    @Autowired  //自动注入同类型bean(多个同类型对象无法使用，此时搭配Qualifier一起使用)
    @Qualifier("name")  //注入名字为name的属性()
    Name name;
    @Autowired
    public void fangfa(Name name){
        System.out.println("autowired自动装配方法" + name);
    }
}
