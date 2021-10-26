package com.zpchcbd.dao;

import com.zpchcbd.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(100, "池灵", "123456", "test", 1);
        int res1 = addUser(user);
        int res2 = delUser(100);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    @Override
    public int delUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.delUser(id);
    }
}
