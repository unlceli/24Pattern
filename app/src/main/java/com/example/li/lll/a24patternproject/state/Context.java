package com.example.li.lll.a24patternproject.state;

/**
 * context 维护一个concreteState 子类的实例，这个实例定义当前的状态
 */
public class Context {


    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        this.state.handle(this);
    }
}
