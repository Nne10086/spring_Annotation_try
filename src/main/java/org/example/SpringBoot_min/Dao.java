package org.example.SpringBoot_min;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component(value = "dao")  //对象名为dao
public class Dao {
    @Bean(value = "user1")  //bean用于方法
    public User user1(){
        return new User("刘" , 19);
    }
    @Autowired  //autowired,qualifier用于属性
    User user;
}
