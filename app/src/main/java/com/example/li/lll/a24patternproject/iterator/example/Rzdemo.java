package com.example.li.lll.a24patternproject.iterator.example;

public class Rzdemo implements Execute {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rzdemo(String name) {
        setName(name);
    }

    @Override
    public void dosth(ControlFlow controlFlow) {
        System.out.println(name + "人照");
        if (name.equals("5")) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Execute next = (Execute) controlFlow.next();

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
