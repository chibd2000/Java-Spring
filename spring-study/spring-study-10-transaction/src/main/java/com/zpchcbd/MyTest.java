package com.zpchcbd;

import com.zpchcbd.dao.UserMapper;
import com.zpchcbd.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = applicationContext.getBean("userMapper", UserMapper.class);
        List<User> userList = userMapperImpl.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
