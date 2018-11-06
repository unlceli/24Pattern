package com.example.li.lll.a24patternproject.decorator;

/**
 * 装饰模式
 *      装饰模式客户端调用代码，装饰的过程更像是层层包装，用前面的对象装饰后面的对象。
 * 装饰模式：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
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
