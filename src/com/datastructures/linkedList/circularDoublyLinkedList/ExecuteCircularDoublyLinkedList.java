package com.datastructures.linkedList.circularDoublyLinkedList;

public class ExecuteCircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedListFactory circularDoublyLinkedListFactory = new CircularDoublyLinkedListFactory();
        circularDoublyLinkedListFactory.createNode(4);
        System.out.println("value of 1st node is : " + circularDoublyLinkedListFactory.head.nodeValue);
    }
}
