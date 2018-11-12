package com.example.li.lll.a24patternproject.builder;

public class ConcreteBuilder2 extends Builder {

    private Product product =new Product();

    @Override
    public void buildPartA(){
        product.add("部件AX");
    }

    @Override
    public void buildPartB() {
        product.add("部件BX");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }
}
