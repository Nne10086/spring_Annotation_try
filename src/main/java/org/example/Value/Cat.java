package org.example.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {

    @Value("刘")  //给name属性注入刘
    private String name;

    @Value("19")  //给age属性注入19
    private int age;

    @Value("${aaa}")  //"${..}"中填入配置文件中key，即可注入value值
    private String id;

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
