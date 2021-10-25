package com.zpchcbd;

import com.zpchcbd.pojo.Student;
import com.zpchcbd.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        System.out.println(user==user2);
    }
}
