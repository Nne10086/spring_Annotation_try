package org.example.IOC_ALL;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Random;

public class Dog_ImportSelector implements ImportSelector {
    Random random = new Random();
    int num = random.nextInt(10);
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        if(num < 5){
            return new String[]{"org.example.IOC_ALL.Dog"};  //满足条件，直接导入类路径指向类bean
        }
        else{
            return new String[0];
        }
    }
}
