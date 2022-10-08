package com.datastructures.linkedList.circularSinglyLinkedList;

public class CircularSinglyLinkedListFactory {
    public Node head;
    public Node tail;
    public int size;

    // create a node
    public void createNode(int valueOfNode) {
        Node node = new Node();
        node.nodeValue = valueOfNode;
        node.nodeReference = node;
        head = node;
        tail =node;
        size = 1;
    }

    // Insert node in linked list at a specified location
    public void insertNode(int valueOfNode, int location) {
        Node node = new Node();
        node.nodeValue = valueOfNode;
        if(head == null) {
            createNode(valueOfNode);
            return;
        } else if (location == 0) {
            node.nodeReference = head;
            head = node;
            tail.nodeReference = head;
        } else if (location >= size) {
            node.nodeReference = head;
            tail.nodeReference = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index <= location) {
                tempNode = tempNode.nodeReference;
                index++;
            }
            node.nodeReference = tempNode;
            tempNode.nodeReference = node;
        }
        size++;
    }
}
