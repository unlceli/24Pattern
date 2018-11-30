package com.example.li.lll.a24patternproject.iterator.example;

public class Sfzdemo implements Execute {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sfzdemo(String name) {
        setName(name);
    }

    @Override
    public void dosth(ControlFlow controlFlow) {
        System.out.println(name + "执行身份证");
        if (name.equals("1")) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            Execute next = (Execute) controlFlow.next();
            Zwdemo o = (Zwdemo)controlFlow.currentItem();
            String name = o.getName();
            System.out.println("");
            next.dosth(controlFlow);
//            do {
//           //     Execute execute= (Execute) controlFlow.currentItem();
//           //     execute.dosth(controlFlow);
//                // System.out.println(controlFlow.currentItem() + "操作。。。！");
//              //  Object next = controlFlow.next();
//
//                System.out.println("");
//            }
//            while (!controlFlow.isDone());
        }

    }
}
