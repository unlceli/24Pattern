package com.example.li.lll.a24patternproject.respondibilitychain;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor =successor;

    }
    public abstract void handleRequest(int request);






}


class ConcreteHandlerA extends Handler{

    @Override
    public void handleRequest(int request) {
        if (request >=0 && request<=10){
            System.out.println(this.getClass().getName() + "处理了请求" + request);
        }else if (successor !=null){
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandlerB extends Handler{

    @Override
    public void handleRequest(int request) {
        if (request >=11 && request<=20){
            System.out.println(this.getClass().getName() + "处理了请求" + request);
        }else if (successor !=null){
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandlerC extends Handler{
    int[] requests = { 2, 14, 5, 6, 8, 23, 12, 21 };
    @Override
    public void handleRequest(int request) {
        if (request >=21 && request<=30){
            System.out.println(this.getClass().getName() + "处理了请求" + request);
        }else if (successor !=null){
            successor.handleRequest(request);
        }
    }
}

