package com.example.li.lll.a24patternproject.datastructure;

import java.security.PublicKey;
import java.util.PropertyResourceBundle;

public class Stack<T> {


    private static class Node<U>{
        private U value;
        private Node<U> next;

        public Node(){
            value =null;
            next =null;
        }

        public Node(U value,Node<U> next){
            this.next =next;
            this.value =value;
        }

        public boolean empty(){
            return value ==null && next ==null;
        }

    }

    /**
     * 定义栈顶元素
     */
    private Node<T> top= new Node<T>();

    /**
     * 入栈操作
     * @param value
     */
    public void push(T value){
        top = new Node<T>(value,top);
    }

    public T pop(){
        T value =top.value;
        if (!top.empty()){
            top =top.next;
        }
        return value;
    }

    public static void main(String [] args){
        Stack<String> stack =new Stack<>();

        String string =" This is test for stack";
        System.out.println("入栈元素（String) 依次：");

        for (String nodeIn : string.split(" ")){
            stack.push(nodeIn);
            System.out.println(nodeIn);
        }

        System.out.println("出栈元素(string)依次为：");
        String nodeOut;
        while ((nodeOut = stack.pop()) !=null){
            System.out.println(nodeOut);
        }
    }


}
