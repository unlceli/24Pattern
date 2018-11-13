package com.example.li.lll.a24patternproject.observer;

public class ObserverClient {

    public static void main(String[] args){
        ConcreteSubject subject =new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject,"1"));
        subject.attach(new ConcreteObserver(subject,"2"));

        subject.attach(new ConcreteObserver(subject,"3"));

        subject.setSujectState("aaa");
        subject.setSujectState("bbb");
        subject.setSujectState("ccc");

        subject.notifyObserver();

    }
}
