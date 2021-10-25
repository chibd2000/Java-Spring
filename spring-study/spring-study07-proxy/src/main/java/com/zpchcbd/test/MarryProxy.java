package com.zpchcbd.test;

public class MarryProxy implements MarryOperation{

    Marry marry;
    public MarryProxy(Marry marry){
        this.marry = marry;
    }

    @Override
    public void toMarry() {
        this.marry.toMarry();
    }
}
