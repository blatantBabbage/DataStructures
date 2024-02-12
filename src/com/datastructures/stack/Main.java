package com.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.isEmpty();
        stack.isFull();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int pop1 = stack.pop();
        System.out.println("Value popped  is "+pop1);
        int pop2 = stack.pop();
        System.out.println("Value popped  is "+pop2);
        int seek = stack.peek();
        System.out.println("Value peeked  is "+seek);
        stack.deleteStack();
    }
}
