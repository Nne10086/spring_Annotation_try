package org.example.SpringBoot_min;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);  //填入配置类地址
        Dao dao = applicationContext.getBean("dao" , Dao.class);  //寻找名字为dao，类型为Dao的对象
        //Dao.class好处：寻找Dao类型的对象 ， 不用强转类型
        System.out.println(dao.user1());
        dao.user.shuchu();
    }
}
