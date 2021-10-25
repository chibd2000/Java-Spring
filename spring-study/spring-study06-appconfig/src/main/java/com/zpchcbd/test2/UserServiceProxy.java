package com.zpchcbd.test2;

public class UserServiceProxy implements UserService {
    UserService userService;
    public UserServiceProxy(UserService userService){
        this.userService = userService;
    }

    @Override
    public void add() {
        System.out.println("log:select");
        this.userService.add();
    }

    @Override
    public void delete() {
        System.out.println("log:select");
        this.userService.delete();
    }

    @Override
    public void update() {
        System.out.println("log:select");
        this.userService.update();
    }

    @Override
    public void select() {
        System.out.println("log:select");
        this.userService.select();
    }
}
