package com.zpchcbd;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

}

@MyAnno
public class Demo1 {
    public void test01(){
    }

    public void test02(){
    }
}

class Demo2 extends Demo1{
    public static void main(String[] args) {
        System.out.println(Demo2.class.isAnnotationPresent(MyAnno.class));
    }
}