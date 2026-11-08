package org.example.Bean_init_destory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class Config {
    @Bean(initMethod = "init" , destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
