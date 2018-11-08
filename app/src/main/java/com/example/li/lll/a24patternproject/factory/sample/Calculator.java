package com.example.li.lll.a24patternproject.factory.sample;

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
