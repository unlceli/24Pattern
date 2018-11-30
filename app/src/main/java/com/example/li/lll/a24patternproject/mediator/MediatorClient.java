package com.example.li.lll.a24patternproject.mediator;

/**
 * 中介者
 * 中介者模式： 用一个中介对象来封装乙烯类的对象的交互，中介者是各对象不需要显示地互相引用，从而使其耦合松散，而且可以独立地改变他们之间对的交互
 *
 *eg：联合国作为中介者，连接各个国家之间的联系。
 */
public class MediatorClient {

    public static void main(String [] args){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        //让两个具体同事类让是中介者的对象

        ConcreteColleague1 concreteColleague1= new ConcreteColleague1(concreteMediator);

        ConcreteColleague2 concreteColleague2=new ConcreteColleague2(concreteMediator);
        //让中介者认识各个具体同事类

        concreteMediator.setC1(concreteColleague1);
        concreteMediator.setC2(concreteColleague2);

        concreteColleague1.sendMsg("吃饭了没有？");
        concreteColleague2.sendMsg("没有呢。你吃饭没？");
    }
}
