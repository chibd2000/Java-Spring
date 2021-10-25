package com.zpchcbd.pojo;

public class Address {
    String address;

    public String getAddress(){
        return this.address;
    }

    public void setAddress(){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
