package com.example.li.lll.a24patternproject.observer;

/**
 * 具体主题或通知着
 */
public class ConcreteSubject extends Subject {

    private String sujectState;

    public String getSujectState() {
        return sujectState;
    }

    public void setSujectState(String sujectState) {
        this.sujectState = sujectState;
    }
}
