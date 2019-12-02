package com.yang.demo04;

import com.yang.demo02.UserService;
import com.yang.demo02.UserServiceImpl;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);//设置要代理的对象
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.delete();

    }
}
