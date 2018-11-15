package com.example.li.lll.a24patternproject.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe(){

    }
    public static SingletonThreadSafe getInstance(){
        if (instance ==null){
            synchronized (SingletonThreadSafe.class){
                if (instance ==null){
                    instance =new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
