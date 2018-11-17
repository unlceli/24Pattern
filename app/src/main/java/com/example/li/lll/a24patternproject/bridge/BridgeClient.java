package com.example.li.lll.a24patternproject.bridge;

public class BridgeClient {

    public static void  main(String [] args0){
        Abstraction a =new AbstractionA("a");
        a.setImplementor(new ConcreteImpletorA());
        a.operation();
        a.setImplementor(new ConcreteImplemtorB());
        a.operation();


        Abstraction b= new AbstractionB("b");
        b.setImplementor(new ConcreteImpletorA());
        b.operation();
        b.setImplementor(new ConcreteImplemtorB());
        b.operation();

    }
}
