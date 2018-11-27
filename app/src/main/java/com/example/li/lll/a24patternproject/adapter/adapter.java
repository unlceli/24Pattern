package com.example.li.lll.a24patternproject.adapter;

public  class adapter  extends Target{
    adaptee adaptee =new adaptee();

    @Override
    public void request() {
        super.request();
        adaptee.specificRequest();
    }
}
