package com.example.li.lll.a24patternproject.iterator.example;

/**
 * 控制
 *
 * @param <T>
 */
public interface ControlFlow<T> {

    public T first();//第一次

    public T next();//执行下一次

    public boolean isDone();//执行完毕。

    public T currentItem();//当前的条目


}
