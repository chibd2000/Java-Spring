package com.zpchcbd.test3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {
    Object proxyTarget;

    public ProxyInvocationHandler(Object proxyTarget){
        this.proxyTarget = proxyTarget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("瞧一瞧，看一看!!!");

        if(method.getName().equals("toSell")){
            try {
                method.invoke(this.proxyTarget, args);
            }catch (Exception e){
                return null;
            }
        }
        System.out.println("要不继续看看???");
        return null;
    }
}
