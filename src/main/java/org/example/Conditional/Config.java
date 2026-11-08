package org.example.Conditional;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("person")  //方法创建对象用bean
    @Conditional({Condition1.class})  //返回true，才创这个对象
    public Person person1(){
        return new Person("刘浩云");
    }
    @Bean("person")
    @Conditional({Condition2.class})  //返回true，才创这个对象
    public Person person2(){
        return new Person("张诗琪");
    }
}
