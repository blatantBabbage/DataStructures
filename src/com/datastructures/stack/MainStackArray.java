package com.datastructures.stack;

public class MainStackArray {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(4);
        stackArray.isEmpty();
        stackArray.isFull();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        int pop1 = stackArray.pop();
        System.out.println("Value popped  is "+pop1);
        int pop2 = stackArray.pop();
        System.out.println("Value popped  is "+pop2);
        int seek = stackArray.peek();
        System.out.println("Value peeked  is "+seek);
        stackArray.deleteStack();
    }
}
