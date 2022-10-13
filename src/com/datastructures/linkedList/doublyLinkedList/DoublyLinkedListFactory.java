package com.datastructures.linkedList.doublyLinkedList;

public class DoublyLinkedListFactory {
    DoublyNode head;
    DoublyNode tail;
    int size;

    // create a doubly node
    public void createNode(int valueOfNode) {
        DoublyNode doublyNode = new DoublyNode();
        doublyNode.nodeValue = valueOfNode;
        doublyNode.nextNode = null;
        doublyNode.prevNode = null;
        head = doublyNode;
        tail = doublyNode;
        size = 1;
    }

    /* Insert node in doubly linked list at a required location */
    public void insertNode(int valueOfNode, int location) {
        DoublyNode node = new DoublyNode();
        node.nodeValue = valueOfNode;
        if(head == null) {
            createNode(valueOfNode);
            return;
        } else if (location == 0) {
            // insert node at the beginning of list
            node.prevNode = null;
            node.nextNode = head;
            head.prevNode = node;
            head = node;
        } else if (location >= size-1) {
            // insert node at the end of list
            node.nextNode = null;
            node.prevNode = tail;
            tail.nextNode = node;
            tail = node;
        } else {
            // insert node somewhere in between of list
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.nextNode;
                index++;
            }
            node.nextNode = tempNode.nextNode;
            node.prevNode = tempNode;
            tempNode.nextNode = node;
            node.nextNode.prevNode = node;
        }
        size++;
    }

    /* Forward traversal - Doubly linked list */
    public void traverseDoublyLinkedList() {
        DoublyNode tempNode = head;
        if(head != null) {
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.nodeValue);
                if(i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.nextNode;
            }
            System.out.println();
        } else {
            System.out.println("Doubly linked list does not exist !!");
        }
    }

    /* Reverse traversal - Doubly linked list */
    public void reverseTraverseDoublyLinkedList() {
        DoublyNode tempNode = tail;
        if(tail != null) {
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.nodeValue);
                if(i != size-1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prevNode;
            }
            System.out.println();
        } else {
            System.out.println("Doubly linked list does not exist !!");
        }
    }

    /* Searching doubly linked list */
    public boolean searchNode(int valueOfNode) {
        if(head != null) {
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.nodeValue == valueOfNode) {
                    System.out.println("Node found at location/index : " + i);
                    return true;
                }
                tempNode = tempNode.nextNode;
            }
            System.out.println("Node not found !!");
            return false;
        }
        System.out.println("Doubly linked list does not exist !!");
        return false;
    }
}
