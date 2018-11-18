package com.example.li.lll.a24patternproject.visitor;

/**
 * 访问者模式： 表示用一个作用于某对象结构中的各元素的操作。它使你可以咋i不改变各个元素的类的前提下定义作用于这些原色的新操作。
 *
 * 访问者模式适合用于数据结构相对稳定的系统。
 */
public class VisitorClient {
    public static void main(String[] args){
        ObjectStructure o =new ObjectStructure();

        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 visitor1 =new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 =new ConcreteVisitor2();
        o.accept(visitor1);
        o.accept(visitor2);
    }
}
