package com.example.li.lll.a24patternproject.facade;

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
