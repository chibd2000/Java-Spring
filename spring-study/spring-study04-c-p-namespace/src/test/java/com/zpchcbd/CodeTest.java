package com.zpchcbd;

import com.zpchcbd.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CodeTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = applicationContext.getBean("people", People.class);
        System.out.println(people);
    }
}
