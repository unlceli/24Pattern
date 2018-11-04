package com.example.li.lll.a24patternproject.strategy;

public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
