package com.example.li.lll.a24patternproject.composite;

import com.example.li.lll.a24patternproject.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children =new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtil.repeatableString("-", depth) + this.name);

        for (Component component: children){
            component.display(depth+2);
        }
    }
}
