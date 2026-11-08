package org.example.Bean_init_destory;

public class Car {
    public Car() {
        System.out.println("调用构造器");
    }
    public void init(){  //编写初始化方法
        System.out.println("init初始化ing");
    }
    public void destroy(){  //编写销毁方法
        System.out.println("destroy销毁ing");
    }
}
