package org.example.IOC_ALL;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

public class Dog {
    public Dog() {
    }
    public void shuchu(){
        System.out.println("调用dog类shuchu方法");
    }
}
