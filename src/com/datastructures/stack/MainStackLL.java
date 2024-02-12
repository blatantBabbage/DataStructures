package com.datastructures.stack;

public class MainStackLL {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.isEmpty();
        stackLinkedList.pop();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.isEmpty();
        stackLinkedList.peek();
        stackLinkedList.pop();
        stackLinkedList.peek();
        stackLinkedList.deleteStack();
    }
}
