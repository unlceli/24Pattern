package com.example.li.lll.a24patternproject.facade;

/**
 * 外观模式 为子系统中的一组接口提供一个一致的画面，此模式定义一个高层接口，这个接口使得这个子系统更加容易使用。
 * 
 */
public class FacadeClient {

    public static void main(String[] args){
        Facade facade =new Facade();
        facade.methodA();
        facade.methodB();
    }
}
