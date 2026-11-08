package org.example.Conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Random;

public class Condition2 implements Condition {  //判断逻辑
    Condition1 condition1 = new Condition1();

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (condition1.b){
            return false;
        }
        return true;
    }
}
