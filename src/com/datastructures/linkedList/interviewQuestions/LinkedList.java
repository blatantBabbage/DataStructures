package com.datastructures.linkedList.interviewQuestions;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.nextNodeRef = null;
        head = node;
        tail = node;
        size = 1;
    }

    // insert node at the end
    public void insertNode(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.nextNodeRef = null;
        tail.nextNodeRef = newNode;
        tail = newNode;
        size++;
    }

    public void traveseLL() {
        Node tempNode = head;
        for(int i=0; i<size; i++) {
            System.out.print(tempNode.value);
            if(i < size-1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.nextNodeRef;
        }
        System.out.println("\n");
    }
}
