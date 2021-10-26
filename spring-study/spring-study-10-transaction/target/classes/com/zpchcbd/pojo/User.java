package com.zpchcbd.pojo;

public class User {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                ", apwd='" + apwd + '\'' +
                ", customer='" + customer + '\'' +
                ", level=" + level +
                '}';
    }

    private int id;
    private String aname;
    private String apwd;
    private String customer;
    private int level;
    public User(){

    }
    public User(int id, String aname, String apwd, String customer, int level) {
        this.id = id;
        this.aname = aname;
        this.apwd = apwd;
        this.customer = customer;
        this.level = level;
    }

}
