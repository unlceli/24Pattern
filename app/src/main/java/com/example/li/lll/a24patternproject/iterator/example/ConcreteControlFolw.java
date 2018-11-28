package com.example.li.lll.a24patternproject.iterator.example;

public class ConcreteControlFolw<T> implements ControlFlow<T> {


    private ConcreteGather<T> concreteGather;

    private int current = 0;


    public ConcreteControlFolw(ConcreteGather<T> concreteGather) {
        this.setConcreteGather(concreteGather);
    }

    @Override
    public T first() {
        return concreteGather.getItem(0);
    }

    @Override
    public T next() {
        current++;
        if (current < concreteGather.count()) {
            return concreteGather.getItem(current);

        } else {

            current = 0;
            return concreteGather.getItem(current);
        }

    }

    @Override
    public boolean isDone() {
        return current >= concreteGather.count() ? true : false;
    }

    @Override
    public T currentItem() {
        return concreteGather.getItem(current);
    }


    public ConcreteGather<T> getConcreteGather() {
        return concreteGather;
    }

    public void setConcreteGather(ConcreteGather<T> concreteGather) {
        this.concreteGather = concreteGather;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
