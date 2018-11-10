package com.example.li.lll.a24patternproject.factory.sample;

/**
 * 简单工厂模式好处：在于工厂类包含必要的的逻辑判断，根据客户端的选择条动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖。
 *
 */
public class Calculator {

    public static void main(String [] args){
        Operation operation;

        char operator;
        operator ='+';

        operation = OperationFactory.createOperation(operator);
        operation.numberA =4;
        operation.numberB=5;
        double result = operation.result();
        System.out.println(result);
    }
}
