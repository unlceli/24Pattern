package com.example.li.lll.a24patternproject.strategy;

public class StrategyClient {

    public static void main(String[] args){
        Context context;
        context =new Context(new ConcreteStrategyA());
        context.contextInterface();


    }
}
