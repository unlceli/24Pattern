package com.example.li.lll.a24patternproject.factory.method;

import com.example.li.lll.a24patternproject.factory.sample.Operation;
import com.example.li.lll.a24patternproject.factory.sample.OperationAdd;
import com.example.li.lll.a24patternproject.factory.sample.OperationDiv;
import com.example.li.lll.a24patternproject.factory.sample.OperationMul;
import com.example.li.lll.a24patternproject.factory.sample.OperationSub;

public interface IFactory {
    public Operation createOperation();

}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
