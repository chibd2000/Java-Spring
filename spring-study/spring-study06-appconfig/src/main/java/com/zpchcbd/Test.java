package com.zpchcbd;

import com.zpchcbd.config.AppConfig;
import com.zpchcbd.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) applicationContext.getBean("getUser");
        System.out.println(user);
    }
}
