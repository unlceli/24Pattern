package com.example.li.lll.a24patternproject.bridge;

public abstract class Abstraction {

    protected  Implementor implementor;

    private String name;

    public Abstraction(String name){
        this.setName(name);
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void operation(){
        System.out.println("Abstration " +this.getName() +":");
        implementor.operation();
    }
}

class  AbstractionA extends Abstraction{


    public AbstractionA(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();
    }
}

class  AbstractionB extends Abstraction{

    public AbstractionB(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();

    }
}


