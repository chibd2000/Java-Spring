package com.zpchcbd.pojo;

public class User {

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
