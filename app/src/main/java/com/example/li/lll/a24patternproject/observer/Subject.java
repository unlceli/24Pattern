package com.example.li.lll.a24patternproject.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题 或抽象通知着
 */
public abstract class Subject {

    private List<Observer> observers =new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer: observers){
            observer.update();
        }
    }
}
