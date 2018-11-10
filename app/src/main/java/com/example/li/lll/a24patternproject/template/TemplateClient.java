package com.example.li.lll.a24patternproject.template;

/**
 * 定义一个操作：
 * 模板使用：当我们要完成在某一个细节层次一致的过程或一系列步骤，但某个别步骤在更详细层面上的实现可能不同时，我们通常会考虑用模板方法模式来处理。
 * 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，末班方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * 可以这么说：模板方法模式是通过把不变行为转移到超类，去除子类中的重复代码，来体现它的优势。
 * 模板方法模式就是提供一个很好的代码复用平台。
 */
public class TemplateClient {
    public static void main(String[] args){
        AbstractTemplate abstractTemplateA =new ConcreteClassA();
        abstractTemplateA.templateMethod();

        AbstractTemplate abstractTemplateB =new ConcreteClassB();
        abstractTemplateB.templateMethod();
    }
}
