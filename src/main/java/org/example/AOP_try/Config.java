package org.example.AOP_try;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.AOP_try")
@EnableAspectJAutoProxy  //开启自动代理
public class Config {
}
