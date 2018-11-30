package com.example.li.lll.a24patternproject.iterator.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @param <T>
 */
public class ConcreteGather<T> implements Gather<T> {
    private List<T> items = new ArrayList<>();

    @Override
    public ControlFlow<T> createContrlFlow() {
        return new ConcreteControlFolw<>(this);
    }

    public int count() {
        return items.size();
    }

    public T getItem(int index ) {
        return items.get(index);
    }

    public void setItem(T item) {
        items.add(item);
    }

}
