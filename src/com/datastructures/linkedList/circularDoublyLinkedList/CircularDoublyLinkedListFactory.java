package com.datastructures.linkedList.circularDoublyLinkedList;

public class CircularDoublyLinkedListFactory {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    /* Create one circular doubly linked list node */
    public void createNode(int valueOfNode) {
        DoublyNode doublyNode = new DoublyNode();
        doublyNode.nodeValue = valueOfNode;
        doublyNode.nextNode = doublyNode;
        doublyNode.prevNode = doublyNode;
        head = doublyNode;
        tail = doublyNode;
        size = 1;
    }
}
