package com.example.li.lll.a24patternproject.iterator.example;

public class Rldemo implements Execute {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rldemo(String name) {
        setName(name);
    }

    @Override
    public void dosth(ControlFlow controlFlow) {
        System.out.println(name + "执行人脸");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (name.equals("4")) {
            Execute first = (Execute) controlFlow.next();

            first.dosth(controlFlow);

           /* do {
             //   Execute execute= (Execute) controlFlow.currentItem();
             //   execute.dosth(controlFlow);
                // System.out.println(controlFlow.currentItem() + "操作。。。！");
                Object next = controlFlow.next();

            }
            while (!controlFlow.isDone());*/
        }

    }


}
