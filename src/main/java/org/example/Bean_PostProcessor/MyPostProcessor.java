package org.example.Bean_PostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component("myPostProcessor")
public class MyPostProcessor implements BeanPostProcessor{
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {  //实现方法，初始化前操作
        System.out.println("初始化前before操作");
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {  //实现方法，初始化啊后操作
        System.out.println("初始化之后after操作");
        return bean;
    }
}
