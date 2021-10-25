package com.zpchcbd.config;


import com.zpchcbd.pojo.People;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean // 相当于一个bean标签
    public People getPeople(){ // getUser   相当于bean标签中的id
        return new People(); // return... 相当于返回要注入到bean的对象
    }
}
