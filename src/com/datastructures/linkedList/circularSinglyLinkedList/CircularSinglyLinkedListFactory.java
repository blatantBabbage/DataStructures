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
}
