package com.example.li.lll.a24patternproject.bridge;

public abstract class Implementor {

    public abstract void operation();


}

class ConcreteImpletorA extends Implementor{

    @Override
    public void operation() {
        System.out.println("ConcreteImpletorA  执行" );
    }
}

class ConcreteImplemtorB extends Implementor{

    @Override
    public void operation() {
        System.out.println("ConcreteImpletorB  执行");
    }
}
