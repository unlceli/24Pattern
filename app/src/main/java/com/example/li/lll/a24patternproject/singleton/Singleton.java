package com.example.li.lll.a24patternproject.singleton;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }

}
