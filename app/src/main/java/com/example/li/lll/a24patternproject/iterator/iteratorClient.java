package com.example.li.lll.a24patternproject.iterator;

/**
 * 迭代器客户端
 *
 * 迭代器： 提供一种方法顺序访问一个集合对象中各个元素，而又不暴露该对象的内部表示。
 *
 * 迭代
 */
public class iteratorClient {

    public static void main(String [] args){
        ConcreteAggregate<String> bus =new ConcreteAggregate<>();
        bus.setItems("1");
        bus.setItems("2");
        bus.setItems("3");
        bus.setItems("4");
        bus.setItems("5");
        bus.setItems("11");bus.setItems("111");
        bus.setItems("22");
        bus.setItems("222");
        bus.setItems("333");
        bus.setItems("444");
        bus.setItems("2222");
        bus.setItems("555");

        Iterator<String> iterator = new ConcreteIterator<>(bus);

        while (!iterator.isDone()){
            System.out.println(iterator.currentItem()+ "号 去 测试");
            if (iterator.currentItem().equals("11")){
                break;
            }
            iterator.next();
        }

    }
}
