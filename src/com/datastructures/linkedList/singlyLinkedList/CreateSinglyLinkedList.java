package com.datastructures.linkedList.singlyLinkedList;

/*
This CreateSinglyLinkedList class does all the operation for the singly linked list as the following:
1. Declares head and tail.
2. Instantiate a node, assign node value and set reference to null as the size of linked list is 1.
3. Assign the above created node to head and tail in order to generate a node link.
 */
public class CreateSinglyLinkedList {
    public Node head;
    public Node tail;
    // everytime a new node is added we'll increase the size
    public int size;

    public Node generateNode(int ValueOfNode) {
        Node node = new Node();
        node.nodeValue = ValueOfNode;
        node.nextReference = null;
        /* here head and tail are only assigned node value so that head and tail can be accessed to traverse the linked
         list and access the last node
         */
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
