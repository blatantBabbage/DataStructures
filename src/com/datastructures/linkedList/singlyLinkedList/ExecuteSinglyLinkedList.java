package com.datastructures.linkedList.singlyLinkedList;

public class ExecuteSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.generateNode(5);
        System.out.println(singlyLinkedList.head.nodeValue);
        singlyLinkedList.insertNode(6,1);
        System.out.println(singlyLinkedList.head.nextReference.nodeValue);
        singlyLinkedList.insertNode(7,2);
        System.out.println(singlyLinkedList.head.nextReference.nextReference.nodeValue);
        singlyLinkedList.insertNode(8,3);
        singlyLinkedList.insertNode(9,4);
        singlyLinkedList.searchNode(9);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.deleteNode(3);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.deleteSinglyLinkedList();
        singlyLinkedList.traverseSinglyLinkedList();
    }
}
