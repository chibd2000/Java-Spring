package com.zpchcbd.config;

import com.zpchcbd.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zpchcbd.pojo")
public class AppConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
