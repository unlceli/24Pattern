package com.example.li.lll.a24patternproject.proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实对象的请求");
    }
}
