package com.datastructures.stack;

public class StackLinkedList {
    SinglyLinkedList singlyLinkedList;

    public StackLinkedList() {
        singlyLinkedList = new SinglyLinkedList();
    }

    // push method
    public void push(int value) {
        singlyLinkedList.insertNode(value,0);
        System.out.println("Pushed value " + value + " in stack");
    }

    // is empty method
    public boolean isEmpty(){
        if(singlyLinkedList.head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    // pop method
    public int pop() {
        int result = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return result;
        }
        else {
            result = singlyLinkedList.head.nodeValue;
            singlyLinkedList.deleteNode(0);
            System.out.println("Deleted node " + result);
            return result;
        }
    }

    // peek method
    public int peek() {
        System.out.println("Peek value is " + singlyLinkedList.head.nodeValue);
        return singlyLinkedList.head.nodeValue;
    }

    // delete method
    public void deleteStack() {
        singlyLinkedList.head = null;
        System.out.println("The Stack is deleted");
    }
}
