package org.example.Import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        User user = applicationContext.getBean(User.class);
        Dao dao = applicationContext.getBean(Dao.class);
        user.shuchu();
        dao.shuchu();
    }
}
