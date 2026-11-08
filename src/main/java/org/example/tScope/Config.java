package org.example.tScope;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean(value = "user1")
    public User user1(){
        return new User("刘浩云");
    }
    @Bean("userPrototype")
    @Scope("prototype")
    public User_prototype userPrototype(){
        return new User_prototype("多实例");
    }
}
