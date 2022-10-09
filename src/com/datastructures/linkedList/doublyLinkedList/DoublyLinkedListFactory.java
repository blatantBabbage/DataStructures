package com.datastructures.linkedList.doublyLinkedList;

public class DoublyLinkedListFactory {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public void createNode(int valueOfNode) {
        DoublyNode doublyNode = new DoublyNode();
        doublyNode.nodeValue = valueOfNode;
        doublyNode.nextNode = null;
        doublyNode.prevNode = null;
        head = doublyNode;
        tail = doublyNode;
        size = 1;
    }
}
