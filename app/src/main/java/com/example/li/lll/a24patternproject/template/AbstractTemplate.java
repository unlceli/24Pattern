package com.example.li.lll.a24patternproject.template;


/**
  实现了一个模板方法，定义算法的骨架，具体子类将重定义primitionOperation 以实现一个算法的步骤。
 */
public abstract class AbstractTemplate {
    public abstract void primitiveOperation1();

    public abstract void primitionOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitionOperation2();
        System.out.println("模板方法结束");
    }
}
