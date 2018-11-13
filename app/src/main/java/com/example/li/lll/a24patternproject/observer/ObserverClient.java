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
 * Subject类： 可翻译为主题或者抽象通知者，一般用一个抽象类或者一个接口实现。它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的光插着。
 * 抽象主题提供一个接口，可以增加和珊瑚观察者对象。
 *
 * Observer类，抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做 更新接口。抽象观察者一般用一个抽象类或者一个接口实现。
 * 更新接口通常包含Up date () 方法，这个方法叫做更新方法。
 *
 * ConcreteSubject 叫做具体主题或具体通知者，在具体主题的内部状态改变时，给所有等级过的观察者发生通知，具体主题角色通常用一个具体子类实现。
 *
 * ConcreteObserver 具体观察者，实现抽象观察者角色所要求的更新接口，以便是本身的状态与主题的状态相协调，
 * 具体观察者角色可以保存一个指向具体主题对象的引用，具体观察者角色通常用一个具体子类实现。
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
