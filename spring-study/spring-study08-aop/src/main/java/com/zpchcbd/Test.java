package com.zpchcbd;

import com.zpchcbd.service.UserService;
import com.zpchcbd.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userServiceImpl = (UserService) applicationContext.getBean("UserService");
        userServiceImpl.add();
    }
}
