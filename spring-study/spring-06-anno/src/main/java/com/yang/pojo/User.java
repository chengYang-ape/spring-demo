package com.yang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.yang.pojo.User"/>
//@Component组件
@Component
@Scope("prototype")
public class User {
    @Value("样洋")
    public String name;
}
