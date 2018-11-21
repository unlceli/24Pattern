package com.example.li.lll.a24patternproject.composite;

import com.example.li.lll.a24patternproject.StringUtil;

public class Leaf extends Component
{
    public Leaf(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }



    @Override
    public void display(int depth) {
        System.out.println(StringUtil.repeatableString("-", depth) + this.name);
    }
}
