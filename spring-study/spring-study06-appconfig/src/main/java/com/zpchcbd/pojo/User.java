package com.zpchcbd.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class User {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    @Value("18")
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Value("池灵")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
