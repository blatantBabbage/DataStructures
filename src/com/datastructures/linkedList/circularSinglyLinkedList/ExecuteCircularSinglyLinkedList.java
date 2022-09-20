package com.datastructures.linkedList.circularSinglyLinkedList;

public class ExecuteCircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedListFactory circularSinglyLinkedListFactory = new CircularSinglyLinkedListFactory();
        circularSinglyLinkedListFactory.createNode(7);
        System.out.println(circularSinglyLinkedListFactory.head.nodeValue);
    }
}
