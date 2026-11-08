package org.example.IOC_ALL;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //作为配置类
@Import({Cat.class , Dog_ImportSelector.class})  //导入普通类和impleselector实现类
public class Config {                            //cat加了@conditional，条件生成  || dog直接在importselector条件生成
}
