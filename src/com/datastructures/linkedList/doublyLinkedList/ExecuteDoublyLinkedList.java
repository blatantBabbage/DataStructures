package com.datastructures.linkedList.doublyLinkedList;

public class ExecuteDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListFactory doublyLinkedListFactory = new DoublyLinkedListFactory();
        doublyLinkedListFactory.createNode(4);
        System.out.println("Value of Head is : " + doublyLinkedListFactory.head.nodeValue);
    }
}
