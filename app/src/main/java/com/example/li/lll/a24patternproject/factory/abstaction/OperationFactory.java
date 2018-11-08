package com.example.li.lll.a24patternproject.factory.abstaction;

import com.example.li.lll.a24patternproject.factory.sample.Operation;
import com.example.li.lll.a24patternproject.factory.sample.OperationAdd;
import com.example.li.lll.a24patternproject.factory.sample.OperationDiv;
import com.example.li.lll.a24patternproject.factory.sample.OperationMul;
import com.example.li.lll.a24patternproject.factory.sample.OperationSub;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    private static Map<String,Class<?>> allOperationMaps = new HashMap<>();

    public static void fillmap(){
        allOperationMaps.put("+", OperationAdd.class);
        allOperationMaps.put("-", OperationSub.class);
        allOperationMaps.put("*", OperationMul.class);
        allOperationMaps.put("/", OperationDiv.class);
    }

    public static Operation createOperation(String operator)throws InstantiationException,IllegalAccessException{
        Operation operation;

        fillmap();
        Class<?> operationclass =allOperationMaps.get(operator);
        if (operationclass ==null){
            throw new RuntimeException("无初始化成功");
        }
        operation = (Operation) operationclass.newInstance();
        return operation;
    }
}
