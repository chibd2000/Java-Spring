package com.zpchcbd.test;

public class Marry implements MarryOperation {
    private String marryName;
    public Marry(String marryName){
        this.marryName = marryName;
    }

    @Override
    public void toMarry() {
        System.out.println("要结婚了...");
    }
}
