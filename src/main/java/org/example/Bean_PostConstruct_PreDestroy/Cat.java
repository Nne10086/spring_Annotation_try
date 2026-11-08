package org.example.Bean_PostConstruct_PreDestroy;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("cat")
public class Cat {

    public Cat() {
    }


    @PostConstruct  //标记为初始化方法
    public void init(){
        System.out.println("init初始化");
    }


    @PreDestroy  //标记为销毁方法
    public void destroy(){
        System.out.println("destroy销毁");
    }
}
