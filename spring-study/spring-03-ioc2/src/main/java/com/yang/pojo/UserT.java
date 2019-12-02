package com.yang.pojo;


public class UserT {
    private String name;
    public void UserT(){
        System.out.println("被创建了！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name = " + name);
    }
}
