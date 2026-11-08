package org.example.Import;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration  //配置类
@Import({User.class , Dao_ImportSlelctor.class})  //直接引入User类,自动生成User对象，并放入ioc容器
public class Config {                             //引入importselector实现类，实现动态引入
}
