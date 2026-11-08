package org.example.IOC_ALL;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Random;

public class Cat_Conditional implements Condition {
    Random random = new Random();
    int num = random.nextInt(10);
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (num < 5) {
            return true;
        } else {
            return false;
        }
    }
}
