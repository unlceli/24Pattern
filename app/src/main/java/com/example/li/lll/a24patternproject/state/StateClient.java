package com.example.li.lll.a24patternproject.state;

/**
 * 状态模式 ：
 * 当一个对象的内在状态改变时候，允许改变其行为，这个对象看起来就是改变了其类。
 */
public class StateClient {
    public static void main(String [] args){
        Context context =new Context(new ConcreateStateA());
        context.request();context.request();context.request();
        context.request();    context.request();    context.request();    context.request();    context.request();
    }
}
