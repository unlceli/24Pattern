package com.example.li.lll.a24patternproject.facade;

/**
 *  外观类： 它需要了解所有的子系统的方法或属性，进行组合，以备外界调用。  Facade 的作用 客户端可以根本不知道三个子系统类的存在。
 *    subSystemFour.methodFour();
 subSystemThree.methodThree();
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;

    public Facade(){
        subSystemFour =new SubSystemFour();
        subSystemOne = new SubSystemOne();
        subSystemTwo =new SubSystemTwo();
        subSystemThree =new SubSystemThree();
    }

    public void methodA(){
        System.out.println("方法A组");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();


    }
    public void methodB(){
        subSystemFour.methodFour();
        subSystemThree.methodThree();
    }
}
