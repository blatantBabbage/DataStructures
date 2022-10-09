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
        System.out.println("\n\nTraversing circular singly linked list --/--");
        circularSinglyLinkedListFactory.traverseCircularSinglyLinkedList();
        circularSinglyLinkedListFactory.searchNode(6);
        circularSinglyLinkedListFactory.deleteNode(0);
        circularSinglyLinkedListFactory.traverseCircularSinglyLinkedList();
        circularSinglyLinkedListFactory.deleteNode(2);
        circularSinglyLinkedListFactory.traverseCircularSinglyLinkedList();
        circularSinglyLinkedListFactory.deleteNode(4);
        circularSinglyLinkedListFactory.traverseCircularSinglyLinkedList();
        circularSinglyLinkedListFactory.deleteCircularSinglyLinkedList();
    }
}
