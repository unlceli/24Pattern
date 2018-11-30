package com.example.li.lll.a24patternproject.iterator.example;

/**
 * 可控制流程，但是在activity直接传递值的话，不能获取，考虑用eventbus3.0传递值。
 */
public class ResponsibilityClient {
    public static void main(String[] arg) {
        ConcreteGather<Execute> gather = new ConcreteGather<Execute>();

        gather.setItem(new Sfzdemo("1"));
        gather.setItem(new Zwdemo("3"));
        gather.setItem(new Rldemo("4"));
        gather.setItem(new Rzdemo("5"));
        ControlFlow controlFlow = new ConcreteControlFolw(gather);

        Execute execute = (Execute) controlFlow.first();

        execute.dosth(controlFlow);
      /*  while (!controlFlow.isDone()) {

           // System.out.println(controlFlow.currentItem() + "操作。。。！");
            controlFlow.next();
        }*/

    }
}
