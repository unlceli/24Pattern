package com.example.li.lll.a24patternproject.state;

public abstract class State {

    public abstract void handle(Context context);

}


class ConcreateStateA extends State{

    @Override
    public void handle(Context context) {
        System.out.println("现在状态为 A");

        context.setState(new ConcreateStateB());
    }
}
class ConcreateStateB extends State{

    @Override
    public void handle(Context context) {
        System.out.println("现在状态为 B");

        context.setState(new ConcreateStateC());
    }
}
class ConcreateStateC extends State{

    @Override
    public void handle(Context context) {
        System.out.println("现在状态为 C");

        context.setState(new ConcreateStateA());
    }
}