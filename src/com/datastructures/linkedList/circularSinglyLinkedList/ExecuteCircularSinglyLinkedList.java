package com.datastructures.linkedList.circularSinglyLinkedList;

public class ExecuteCircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedListFactory circularSinglyLinkedListFactory = new CircularSinglyLinkedListFactory();
        circularSinglyLinkedListFactory.createNode(7);
        System.out.println(circularSinglyLinkedListFactory.head.nodeValue);
        circularSinglyLinkedListFactory.insertNode(5,0);
        System.out.println(circularSinglyLinkedListFactory.head.nodeValue);
        circularSinglyLinkedListFactory.insertNode(7,7);
        System.out.println(circularSinglyLinkedListFactory.tail.nodeValue);
        circularSinglyLinkedListFactory.insertNode(6,1);
        System.out.println(circularSinglyLinkedListFactory.head.nodeValue);
    }
}
