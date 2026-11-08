package org.example.Bean_InitializingBean_DisposableBean;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("cat")  //需要被soring识别
public class Cat implements InitializingBean, DisposableBean {  //实现两个接口
    public Cat() {
    }

    @Override
    public void destroy() throws Exception {  //销毁方法
        System.out.println("销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {  //初始化方法
        System.out.println("初始化");
    }
}
