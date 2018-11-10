package com.example.li.lll.a24patternproject.template;

public abstract class AbstractTemplate {
    public abstract void primitiveOperation1();

    public abstract void primitionOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitionOperation2();
        System.out.println("模板方法结束");
    }
}
