package com.zpchcbd.test;

public class Host implements HostOperation {
    private String hostName;
    public Host(String hostName){
        this.hostName = hostName;
    }
    @Override
    public void toSell() {
        System.out.println("房东出租房子...");
    }
}
