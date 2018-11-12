package com.example.li.lll.a24patternproject.builder;

/**
 * 建造者模式：
    建造者模式：讲一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * Builder 是为创建一个Product对象的各个部件制定的抽象接口。
 * DIRECTOR 是构建一个使用Buukder接口的对象。
 * ConcreteBuilder 具体建造者，实现Builder接口，构造和装备各个部件。
 * Product 具体产品。
 *
 * 建造者模式的好处就是使得代码与表示代码分离，由于建造者隐藏了该产品是如何组装的，所以如需要改变一个产品的内部表示，只需要在定义一个具体的建造者就是可以了
 */
public class BuilderClient {
    public static void main(String [] artgs){
        Director director =new Director();
        Builder builder =new ConcreteBuilder1();
        Builder builder1 =new ConcreteBuilder2();

        director.construct(builder);
        Product product= builder.getBuildResult();
        product.show();


        director.construct(builder1);
      Product product1 =  builder1.getBuildResult();

      product1.show();

    }
}
