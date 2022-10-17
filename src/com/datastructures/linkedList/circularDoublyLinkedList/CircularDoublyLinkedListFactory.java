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

    /* Insert node in circular doubly linked list at a specified location */
    // By location we basically mean index as location starts with '0'
    public void insertNode(int valueOfNode, int location) {
        DoublyNode doublyNode = new DoublyNode();
        doublyNode.nodeValue = valueOfNode;
        if(head == null) {
            createNode(valueOfNode);
            return;
        } else if (location == 0) {
            /* inserting node at the beginning */
            doublyNode.nextNode = head;
            doublyNode.prevNode = head.prevNode;
            head.prevNode = doublyNode;
            head = doublyNode;
            tail.nextNode = doublyNode;
        } else if (location >= size) {
            doublyNode.nextNode = head;
            doublyNode.prevNode = tail;
            tail.nextNode = doublyNode;
            tail = doublyNode;
            head.prevNode = doublyNode;
        } else {
            DoublyNode tempDoublyNode = head;
            int index = 0;
            while (index < location-1) {
                tempDoublyNode = tempDoublyNode.nextNode;
                index++;
            }
            doublyNode.nextNode = tempDoublyNode.nextNode;
            doublyNode.prevNode = tempDoublyNode.nextNode.prevNode;
            tempDoublyNode.nextNode.prevNode = doublyNode;
            tempDoublyNode.nextNode = doublyNode;
        }
        size++;
    }

    /* Forward traversal - Circular Doubly linked list */
    public void traverseDoublyLinkedList() {
        if(head != null) {
            DoublyNode doublyNode = head;
            for (int i=0; i<size; i++) {
                System.out.print(doublyNode.nodeValue);
                doublyNode = doublyNode.nextNode;
                if (i < size-1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Circular doubly linked list does not exist !!");
        }
    }
}
