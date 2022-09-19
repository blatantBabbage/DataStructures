package com.datastructures.linkedList.singlyLinkedList;

public class ExecuteSinglyLinkedList {

    public static void main(String[] args) {
        CreateSinglyLinkedList createSinglyLinkedList = new CreateSinglyLinkedList();
        createSinglyLinkedList.generateNode(5);
        System.out.println(createSinglyLinkedList.head.nodeValue);
        createSinglyLinkedList.insertNode(6,1);
        System.out.println(createSinglyLinkedList.head.nextReference.nodeValue);
        createSinglyLinkedList.insertNode(7,2);
        System.out.println(createSinglyLinkedList.head.nextReference.nextReference.nodeValue);
        createSinglyLinkedList.insertNode(8,3);
        createSinglyLinkedList.insertNode(9,4);
        createSinglyLinkedList.searchNode(9);
        createSinglyLinkedList.traverseSinglyLinkedList();
        createSinglyLinkedList.deleteNode(3);
        createSinglyLinkedList.traverseSinglyLinkedList();
        createSinglyLinkedList.deleteSinglyLinkedList();
        createSinglyLinkedList.traverseSinglyLinkedList();
    }
}
