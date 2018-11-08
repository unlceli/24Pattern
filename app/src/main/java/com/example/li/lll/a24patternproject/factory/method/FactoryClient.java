package com.example.li.lll.a24patternproject.factory.method;

import com.example.li.lll.a24patternproject.factory.sample.Operation;

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
