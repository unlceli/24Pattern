package com.example.li.lll.a24patternproject.decorator;

/**
 * Decorator 类，装饰抽象类，继承Component，从外类来扩展Compponent类的功能，
 *
 * 但对于扩展Component来说，是无需知道Decorator的存在的。
 */
public abstract class Decorator extends Component{

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component !=null){
            component.operation();
        }
    }

}

class ConcreteDecoratorA extends Decorator{

    private String addeState;
    @Override
    public void operation() {
        super.operation();
        addeState = "A 中 new STATE";
        System.out.println(addeState+"具体装饰对象A的操作");
    }

}
class ConcreteDecoratorB extends Decorator{
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    public void addedBehavior() {
        System.out.print("B中的新增行为 ");
    }
}
class ConcreteDecoratorC extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("C没有特殊行为 " + "具体装饰对象C的操作");
    }

}
