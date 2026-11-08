package org.example.Conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Random;

public class Condition1 implements Condition {
    Random random = new Random();
    int num = random.nextInt(10);  //随机0-9一个数
    boolean b = false;

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (num >= 5){  //重写matches方法，加入conditional判断逻辑
            b = true;
            return true;
        }
        return false;
    }
}
