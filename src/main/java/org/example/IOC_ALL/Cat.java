package org.example.IOC_ALL;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component("cat")
@Conditional({Cat_Conditional.class})  //返回true，生成bean
public class Cat {
    public Cat() {
    }
    public void shuchu(){
        System.out.println("调用cat类shuchu方法");
    }
}
