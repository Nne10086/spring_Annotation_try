package org.example.SpringBoot_min;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //告诉spring，这是配置类
@ComponentScan(basePackages = {"org.example.SpringBoot_min"})  //扫描该包，填入包路径（不是类路径）
public class Config {    //配置类
}
