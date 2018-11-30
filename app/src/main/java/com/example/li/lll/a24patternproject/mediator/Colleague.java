package com.example.li.lll.a24patternproject.mediator;

public abstract  class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator =mediator;
    }

    public abstract void sendMsg(String message);

    public abstract void notifyMsg(String message);
}


class ConcreteColleague1 extends Colleague{


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String message) {
        mediator.send(message,this);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("同事1 得到消息"+message);
    }
}


class ConcreteColleague2 extends Colleague{


    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String message) {
        mediator.send(message,this);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("同事2 得到消息"+ message);
    }
}
