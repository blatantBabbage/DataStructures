package com.datastructures.linkedList.circularSinglyLinkedList;

public class ExecuteCircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedListFactory circularSinglyLinkedListFactory = new CircularSinglyLinkedListFactory();
        circularSinglyLinkedListFactory.createNode(7);
        System.out.println("head is " + circularSinglyLinkedListFactory.head.nodeValue);
        circularSinglyLinkedListFactory.insertNode(5,0);
        System.out.println("head is " + circularSinglyLinkedListFactory.head.nodeValue);
        circularSinglyLinkedListFactory.insertNode(8,7);
        System.out.println("tail is " + circularSinglyLinkedListFactory.tail.nodeValue);
        circularSinglyLinkedListFactory.insertNode(6,1);
        System.out.println("head is " + circularSinglyLinkedListFactory.head.nodeValue);
        System.out.println("\n\n******Testing*******");
        System.out.println("<0> " + circularSinglyLinkedListFactory.head.nodeValue);
        System.out.println("<1> " + circularSinglyLinkedListFactory.head.nodeReference.nodeValue);
        System.out.println("<2> " + circularSinglyLinkedListFactory.head.nodeReference.nodeReference.nodeValue);
        System.out.println("<3> " + circularSinglyLinkedListFactory.head.nodeReference.nodeReference.nodeReference.nodeValue);
        System.out.println("******Testing*******");
        System.out.println("\n\nTraversing circular singly linked list --/--");
        circularSinglyLinkedListFactory.traverseCircularSinglyLinkedList();
    }
}
