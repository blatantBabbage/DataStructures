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
        if(head == null) {
            createLL(nodeValue);
            return;
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.nextNodeRef = null;
        tail.nextNodeRef = newNode;
        tail = newNode;
        size++;
    }

    public void traverseAlt() {
        Node runner = head;
        while (runner != null) {
            System.out.print(runner.value);
            if(runner.nextNodeRef != null) {
                System.out.print(" -> ");
            }
            runner = runner.nextNodeRef;
        }
        System.out.println("\n");
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
