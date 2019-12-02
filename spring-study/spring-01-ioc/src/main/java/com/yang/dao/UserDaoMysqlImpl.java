package com.yang.dao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("mysql获取用户的数据");
    }
}
