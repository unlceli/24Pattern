package com.example.li.lll.a24patternproject.proxy;

/**
 * 代理类
 */
public class Proxy implements Subject {
    Subject subject;

    public Proxy(){
        subject =new RealSubject();
    }


    @Override
    public void request() {
        subject.request();
    }
}
