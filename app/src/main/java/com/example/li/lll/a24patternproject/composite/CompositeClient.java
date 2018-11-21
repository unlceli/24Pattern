package com.example.li.lll.a24patternproject.composite;

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
