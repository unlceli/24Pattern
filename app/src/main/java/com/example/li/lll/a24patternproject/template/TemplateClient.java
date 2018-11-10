package com.example.li.lll.a24patternproject.template;

public class TemplateClient {
    public static void main(String[] args){
        AbstractTemplate abstractTemplateA =new ConcreteClassA();
        abstractTemplateA.templateMethod();

        AbstractTemplate abstractTemplateB =new ConcreteClassB();
        abstractTemplateB.templateMethod();
    }
}
