package org.example.Import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Random;

public class Dao_ImportSlelctor  implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {//实现selectImport方法，返回加入类全类名（包类路径)
        Random random = new Random();
        int num = random.nextInt(10);
        if (num < 5){
            System.out.println("随机数小于5，引入Dao1");
            return new String[]{"org.example.Import.Dao1"};  //返回bean对象类全路径（包类路径），放在string数组中，引入该类对象
        }
        else{
            System.out.println("随机数大于5，引入Dao2");
            return new String[]{"org.example.Import.Dao2"};  //返回bean对象类全路径（包类路径），放在string数组中，引入该类对象
        }
        //返回的全路径的类传给其他方法，实现引入
    }
}
