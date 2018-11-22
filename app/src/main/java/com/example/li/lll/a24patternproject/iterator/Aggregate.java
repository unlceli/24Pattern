package com.example.li.lll.a24patternproject.iterator;

/**
 * 聚集接口
 * @param <T>
 */
public interface Aggregate<T> {

    public Iterator<T>  createIterator();


}
