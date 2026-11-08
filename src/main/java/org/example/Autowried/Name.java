package org.example.Autowried;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("name")
public class Name {
    public void shuchu(){
        System.out.println("名字为Nne");
    }

}
