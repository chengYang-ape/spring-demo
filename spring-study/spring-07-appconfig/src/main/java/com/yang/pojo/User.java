package com.yang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//这个注解的意思说明这个类被spring接管了，注册到容器中！
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    //属性注入值
    @Value("样洋")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
