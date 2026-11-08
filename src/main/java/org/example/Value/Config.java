package org.example.Value;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:property")  //加载外部配置文件（PropertySource） ， classpath自动扫描resources包下面文件
@ComponentScan(basePackages = "org.example.Value")
public class Config {
}
