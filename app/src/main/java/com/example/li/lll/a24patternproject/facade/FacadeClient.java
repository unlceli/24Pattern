package com.example.li.lll.a24patternproject.facade;

/**
 * 外观模式 为子系统中的一组接口提供一个一致的画面，此模式定义一个高层接口，这个接口使得这个子系统更加容易使用。
 *
 * 如何使用：
 *   1首先在设计初期阶段，应该要有意识的将不同的两个层分离，
 *   2其次 在开发阶段，子系统往往不断的重构烟花而变得越来越复杂，大多数模式使用也都会产生很小的类，
 *   这本是好事，但也给外部调用他们的用户程序带来了使用上的困难，
 *   增加外观Faceade 可以提供一个简单的接口，减少他们之间的依赖。
 *   3第三：在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展了，
 *   可以为新系统开发一个外观类，来提供设计粗糙或高度复杂的遗留代码的比较清晰简单的接口，
 *   让新系统与facade 类对象交互，facade与遗留代码交互所有复杂的工作。
 */
public class FacadeClient {

    public static void main(String[] args){
        Facade facade =new Facade();
        facade.methodA();
        facade.methodB();
    }
}
