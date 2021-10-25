package com.zpchcbd.test;

public class HostProxy implements HostOperation {

    Host host;
    public HostProxy(Host host){
        this.host = host;
    }
    @Override
    public void toSell() {
        this.host.toSell();
    }
}
