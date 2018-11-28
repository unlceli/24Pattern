package com.example.li.lll.a24patternproject.iterator.example;

import java.lang.reflect.Field;

public class Zwdemo implements Execute {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zwdemo(String name) {
        setName(name);
    }

    @Override
    public void dosth(ControlFlow controlFlow) {
        System.out.println(name + "执行指纹");
        if (name.equals("3")) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Execute next = (Execute) controlFlow.next();
            next.dosth(controlFlow);
//            do {
//            //    Execute execute= (Execute) controlFlow.currentItem();
//            //    execute.dosth(controlFlow);
//                // System.out.println(controlFlow.currentItem() + "操作。。。！");
//                controlFlow.next();
//            }
//            while (!controlFlow.isDone());
        }
    }


    /**
     * 根据属性名获取属性值
     *
     * @param fieldName
     * @param object
     * @return
     */
    private String getFieldValueByFieldName(String fieldName, Object object) {
        try {
            Field field = object.getClass().getField(fieldName);
            //设置对象的访问权限，保证对private的属性的访问

            return (String) field.get(object);
        } catch (Exception e) {

            return null;
        }

    }


}
