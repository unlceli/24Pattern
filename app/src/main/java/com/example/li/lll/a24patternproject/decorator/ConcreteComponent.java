package com.example.li.lll.a24patternproject.decorator;

/**
 * ConcreateComponent 是定义了一个具体的对象。
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
