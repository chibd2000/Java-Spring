package com.zpchcbd.test;

import sun.management.HotSpotDiagnostic;

public class Client {
    public static void main(String[] args) {
        Host host = new Host("小德房东");
        HostProxy hostProxy = new HostProxy(host);
        hostProxy.toSell();
    }
}
