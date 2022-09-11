package com.datastructures.linkedList.singlyLinkedList;

public class ExecuteSinglyLinkedList {

    public static void main(String[] args) {
        CreateSinglyLinkedList createSinglyLinkedList = new CreateSinglyLinkedList();
        createSinglyLinkedList.generateNode(5);
        System.out.println(createSinglyLinkedList.head.nodeValue);
    }
}
