package org.example.FactoryBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Color_FactoryBean.class)  //引入factroybean即可，创建对象
public class Config {
}
