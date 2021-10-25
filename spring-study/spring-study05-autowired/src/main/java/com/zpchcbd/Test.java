package com.zpchcbd;

import com.zpchcbd.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;


public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) applicationContext.getBean("people");
        people.getCat().Shout();
    }
}
