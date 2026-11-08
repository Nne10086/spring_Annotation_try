package org.example.Bean_PostProcessor;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("cat")
public class Cat {
    public void shuchu(){
        System.out.println("cat类");
    }
    @PostConstruct  //初始化操作
    public void init(){
        System.out.println("初始化");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }
}
