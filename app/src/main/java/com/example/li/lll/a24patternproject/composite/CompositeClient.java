package com.example.li.lll.a24patternproject.composite;

/**
 * 组合模式：将对象组合成树形结构以表示， ‘部分-整体’ 的层次结构，组合模式使得用户对单个对象和组合对象的使用具体一致性。
 *
 * 使用：当发现需求中体现部分与整体层次的机构时候，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合机构
 * 中的所有对象时候，就应该考虑用组合模式。
 */
public class CompositeClient
    {
        public static void main(String[] args){
            Composite root =new Composite("root");

            root.add(new Leaf("leaf a"));
            root.add(new Leaf("leaf b"));

            Composite compositex =new Composite("Composite x");
            compositex.add(new Leaf("leaf x -a"));
            compositex.add(new Leaf("leaf x -b"));
            root.add(compositex);


            Composite compositeXY = new Composite("Composite X-Y");
            compositeXY.add(new Leaf("Leaf X-Y-A"));
            compositeXY.add(new Leaf("Leaf X-Y-B"));
            compositex.add(compositeXY);

            root.display(1);

        }
}
