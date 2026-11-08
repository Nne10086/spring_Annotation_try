package org.example.FactoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

public class Color_FactoryBean implements FactoryBean<Color> {
    @Nullable
    @Override
    public Color getObject() throws Exception {  //创建对象
        return new Color();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {  //对象类型

        return Color.class;
    }

    @Override
    public boolean isSingleton() {  //是否为单实例
        return true;
    }
}
