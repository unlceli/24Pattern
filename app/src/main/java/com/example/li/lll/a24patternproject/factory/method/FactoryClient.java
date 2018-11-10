package com.example.li.lll.a24patternproject.factory.method;

import com.example.li.lll.a24patternproject.factory.sample.Operation;

/**
 *  使用简单工厂模式虽然去除了与具体产品的依赖（就是选择哪一个功能是不需要客户端来判断的，是由工厂模式判断的，但是当需要添加新的功能时候，不但对扩展开放了，对修改也开放了，违背了 开放-封闭的原则。
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个实例化延迟到其子类。
 *
 * 工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑判断移到了客户端代来进行，你想要的功能，本来是改工厂类的，二现在是修改客户端。
 */
public class FactoryClient {
    public static void main(String[] args){
        IFactory operFactory =new AddFactory();
        Operation operation =operFactory.createOperation();
        operation.numberA =4;
        operation.numberB =5;
        double result = operation.result();

        System.out.println(result);
    }
}
