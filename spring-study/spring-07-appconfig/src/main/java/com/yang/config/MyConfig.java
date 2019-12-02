package com.yang.config;

import com.yang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 这个也会被spring容器托管，注册到容器中，因为它本来就是一个@Component，
// @Configuration代表这是一个配置类，和beans。xml是一样的
@Configuration
@ComponentScan("com.yang.pojo")
public class MyConfig {

    //注册一个bean 相当于bean标签
    //方法名字相当于xml中的id属性
    //方法的返回值相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();
    }


}
