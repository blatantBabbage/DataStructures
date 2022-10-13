package com.datastructures.linkedList.doublyLinkedList;

public class ExecuteDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListFactory doublyLinkedListFactory = new DoublyLinkedListFactory();
        doublyLinkedListFactory.createNode(4);
        System.out.println("Value of Head is : " + doublyLinkedListFactory.head.nodeValue);
        doublyLinkedListFactory.insertNode(5,0);
        System.out.println("Value of Head is : " + doublyLinkedListFactory.head.nodeValue);
        doublyLinkedListFactory.insertNode(7,1);
        System.out.println("Value of tail is : " + doublyLinkedListFactory.tail.nodeValue);
        doublyLinkedListFactory.insertNode(6,1);
        System.out.println("Value of tail is : " + doublyLinkedListFactory.tail.nodeValue);
    }
}