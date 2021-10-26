package com.zpchcbd.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 等价于 <bean id="User" class="com.zpchcbd.pojo.User" />
@Component
public class User {
    @Value("池灵")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
