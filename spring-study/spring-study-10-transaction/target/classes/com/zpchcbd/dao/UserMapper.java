package com.zpchcbd.dao;

import com.zpchcbd.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    int addUser(User user);
    int delUser(int id);
}
