package com.datastructures.linkedList.doublyLinkedList;

public class ExecuteDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListFactory doublyLinkedListFactory = new DoublyLinkedListFactory();
        doublyLinkedListFactory.createNode(5);
        System.out.println("Value of Head is : " + doublyLinkedListFactory.head.nodeValue);
        doublyLinkedListFactory.insertNode(4,0);
        System.out.println("Value of Head is : " + doublyLinkedListFactory.head.nodeValue);
        doublyLinkedListFactory.insertNode(6,1);
        System.out.println("Value of tail is : " + doublyLinkedListFactory.tail.nodeValue);
        doublyLinkedListFactory.insertNode(7,2);
        System.out.println("Value of tail is : " + doublyLinkedListFactory.tail.nodeValue);
        doublyLinkedListFactory.traverseDoublyLinkedList();
        doublyLinkedListFactory.reverseTraverseDoublyLinkedList();
        doublyLinkedListFactory.searchNode(6);
        doublyLinkedListFactory.deleteNode(0);
        doublyLinkedListFactory.traverseDoublyLinkedList();
        doublyLinkedListFactory.deleteNode(1);
        doublyLinkedListFactory.traverseDoublyLinkedList();
        doublyLinkedListFactory.deleteDoublyLinkedList();
    }
}
