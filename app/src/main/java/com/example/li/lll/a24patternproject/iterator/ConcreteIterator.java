package com.example.li.lll.a24patternproject.iterator;


/**
 * 具体迭代器，给出一种具体迭代器的实现方式，   思考：迭代器表示的是一种迭代行为，而聚集则是真正要迭代的数据集合。
 * 之所以要讲迭代器和聚集分开，就是为了将行为和数据分开。
 *
 * 可类比java中的iterator 与iterable 的关系进行理解。
 * @param <T>
 */
public class ConcreteIterator<T> implements Iterator<T>{

    private ConcreteAggregate<T> concreteAggregate;
    private int current =0;

    public ConcreteAggregate<T> getConcreteAggregate() {
        return concreteAggregate;
    }

    public void setConcreteAggregate(ConcreteAggregate<T> concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public ConcreteIterator(ConcreteAggregate<T> concreteAggregate){
        this.setConcreteAggregate(concreteAggregate);
    }



    @Override
    public T first() {
        return concreteAggregate.getItems(0);
    }

    @Override
    public T next() {
        current ++;
        if (current <concreteAggregate.count()){
            return concreteAggregate.getItems(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current >=concreteAggregate.count() ? true: false;
    }

    @Override
    public T currentItem() {
        return concreteAggregate.getItems(current);
    }
}
