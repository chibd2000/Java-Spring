package com.zpchcbd;

import com.zpchcbd.config.AppConfig;
import com.zpchcbd.pojo.User;
import com.zpchcbd.test3.Host;
import com.zpchcbd.test3.HostOperation;
import com.zpchcbd.test3.ProxyInvocationHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = (User) applicationContext.getBean("getUser");
//        System.out.println(user.getName());

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
