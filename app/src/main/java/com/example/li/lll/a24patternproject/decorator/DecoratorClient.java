package com.example.li.lll.a24patternproject.decorator;

/**
 * 装饰模式
 */
public class DecoratorClient {

    public static void main(String [] args){
        ConcreteComponent concreteComponent =new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA =new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB= new ConcreteDecoratorB();
        ConcreteDecoratorC concreteDecoratorC =new ConcreteDecoratorC();
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorC.setComponent(concreteDecoratorB);
        concreteDecoratorC.operation();
    }
}
