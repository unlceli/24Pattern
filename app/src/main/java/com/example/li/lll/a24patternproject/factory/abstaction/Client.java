package com.example.li.lll.a24patternproject.factory.abstaction;

import com.example.li.lll.a24patternproject.factory.sample.Operation;

public class Client {
    public static void main(String[] args) throws  InstantiationException,IllegalAccessException{
        Operation operation =OperationFactory.createOperation("+");

        operation.numberA= 4;
        operation.numberB =51;
        double result = operation.result();

        System.out.println(result);

    }

}
