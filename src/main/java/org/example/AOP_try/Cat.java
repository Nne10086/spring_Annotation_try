package org.example.AOP_try;


import org.springframework.stereotype.Component;

//业务类（被增强类）
@Component("cat")
public class Cat {
    public void fangfa(){
        System.out.println("业务类方法本体");
    }
}
