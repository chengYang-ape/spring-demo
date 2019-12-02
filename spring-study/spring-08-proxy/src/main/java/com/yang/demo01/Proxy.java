package com.yang.demo01;

public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        setHouse();
        host.rent();
        hetong();
        fare();
    }
    //看房
    public void setHouse(){
        System.out.println("中介带你看房！");
    }
    public void fare(){
        System.out.println("收中介费！");
    }
    public void hetong(){
        System.out.println("签订租赁合同");
    }
}
