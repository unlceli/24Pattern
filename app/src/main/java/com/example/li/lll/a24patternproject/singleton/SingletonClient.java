package com.example.li.lll.a24patternproject.singleton;

/**
 * 单例模式： 保证一个类仅有一个实例，并提供一个访问他的全局访问点。
 *
 * 通常可以让一个全局变量使得一个对象被访问，但它不能防止你实例化多个对象多个对象，一个最好的办法就是，让类自身负责保存它的唯一实例。
 * 这个类可以保证没有其他实例可以被创建，并且它可以提供一个访问该实例的方法。
 */
public class SingletonClient {
    public static void main(String [] args){
        SingletonThreadSafe instance1 =SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 =SingletonThreadSafe.getInstance();

        if (instance1.equals(instance2)){
            System.out.println("同样的实例");
        }else {
            System.out.println("不同的实例");
        }
    }
}
