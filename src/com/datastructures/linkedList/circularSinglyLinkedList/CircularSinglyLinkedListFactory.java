package com.datastructures.linkedList.circularSinglyLinkedList;

public class CircularSinglyLinkedListFactory {
    public Node head;
    public Node tail;
    public int size;

    // create a single node
    public void createNode(int valueOfNode) {
        Node node = new Node();
        node.nodeValue = valueOfNode;
        // nodeReference is referencing itself here as it's a circular singly linked list
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
            /* to insert a node at the beginning */
            // newly inserted node points to next node, whose reference was stored in head
            node.nodeReference = head;
            // head is updated to point at newly inserted node at the beginning
            head = node;
            // last node is updated to point at newly inserted node at the beginning
            tail.nodeReference = head;
        } else if (location >= size) {
            // newly inserted node points at the end needs to point to node at beginning whose reference is stored in head
            node.nodeReference = head;
            // older node at the end needs to point at newly inserted node at the end
            tail.nodeReference = node;
            // tail should point to new node inserted at the end
            tail = node;
        } else {
            // creating a temp node and assigning head reference to it, so that we can loop from the beginning
            Node tempNode = head;
            int index = 0;
            while (index <= location-1) {
                tempNode = tempNode.nodeReference;
                index++;
            }
            // pointing the newly inserted node to the next node by taking its reference from current node
            node.nodeReference = tempNode;
            // updating current node to point to newly inserted node
            tempNode.nodeReference = node;
        }
        // increment the size of linked list, everytime insertion operation is performed
        size++;
    }
}
