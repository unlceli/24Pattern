package com.example.li.lll.a24patternproject.observer;

/**
 * 大话 P131
 * 观察者模式：
 * 定义： 定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个这题对象在状态发生变化时，
 * 会通知所有观察者对象，使他们能够自己更新自己。
 *
 * 1.特点 讲一个系统分割成一系列相互协作的类有一个很不好的副作用，
 * 那就是需要维护相关对象间的一致性，我们不许忘为了维护一致性而使得各类紧密耦合，这样会给维护扩展和重用带来不便。
 *
 */
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
