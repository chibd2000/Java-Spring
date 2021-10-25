package com.zpchcbd;

import com.zpchcbd.test3.Host;
import com.zpchcbd.test3.HostOperation;
import com.zpchcbd.test3.ProxyInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Host host = new Host("小德房东");
        InvocationHandler invocationHandler = new ProxyInvocationHandler(host);

        // 动态生成代理类
        HostOperation proxy = (HostOperation) Proxy.newProxyInstance(
                Host.class.getClassLoader(),
                new Class[]{HostOperation.class},
                invocationHandler);

        proxy.toSell();
    }
}
