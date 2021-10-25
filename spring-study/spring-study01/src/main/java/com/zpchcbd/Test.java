package com.zpchcbd;

import com.zpchcbd.dao.UserDao;
import com.zpchcbd.dao.UserDaoImpl;
import com.zpchcbd.dao.UserDaoMysqlImpl;
import com.zpchcbd.service.UserService;
import com.zpchcbd.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.MalformedLinkException;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("UserServiceImpl");
        userService.getUser();
    }
}
