package com.zpchcbd;

import com.zpchcbd.dao.UserMapper;
import com.zpchcbd.dao.UserMapperImpl;
import com.zpchcbd.dao.UserMapperImpl2;
import com.zpchcbd.pojo.User;
import com.zpchcbd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MBT {
    @Test
    public void test01(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl2 userMapperImpl = applicationContext.getBean("userDao2", UserMapperImpl2.class);
        List<User> userList = userMapperImpl.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
