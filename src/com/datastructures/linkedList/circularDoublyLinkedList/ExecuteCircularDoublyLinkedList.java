package com.datastructures.linkedList.circularDoublyLinkedList;

public class ExecuteCircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedListFactory circularDoublyLinkedListFactory = new CircularDoublyLinkedListFactory();
        circularDoublyLinkedListFactory.createNode(5);
        System.out.println("value of 1st node is : " + circularDoublyLinkedListFactory.head.nodeValue);
        circularDoublyLinkedListFactory.insertNode(4,0);
        System.out.println("value of 1st node is : " + circularDoublyLinkedListFactory.head.nodeValue);
        circularDoublyLinkedListFactory.insertNode(7,3);
        System.out.println("value of last node is : " + circularDoublyLinkedListFactory.tail.nodeValue);
        circularDoublyLinkedListFactory.insertNode(6,2);
        System.out.println("value of 3rd node is : " + circularDoublyLinkedListFactory.head.nextNode.nextNode.nodeValue);
        circularDoublyLinkedListFactory.traverseDoublyLinkedList();
    }
}
