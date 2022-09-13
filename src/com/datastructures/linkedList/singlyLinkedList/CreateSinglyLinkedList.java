package com.datastructures.linkedList.singlyLinkedList;

/*
This CreateSinglyLinkedList class does all the operation for the singly linked list as the following:
1. Declares head and tail.
2. Instantiate a node, assign value to node and set reference to null if the size of linked list is 1.
3. Assign the above created node to head and tail in order to generate a node link.
 */
public class CreateSinglyLinkedList {
    public Node head;
    public Node tail;
    // everytime a new node is added we'll increase the size
    public int size;

    public Node generateNode(int valueOfNode) {
        Node node = new Node();
        node.nodeValue = valueOfNode;
        node.nextReference = null;
        /* here head and tail are only assigned node value so that head and tail can be accessed to traverse the linked
         list and access the last node
         */
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert node in linked list
    public void insertNode(int valueOfNode, int location) {
        Node node = new Node();
        node.nodeValue =valueOfNode;
        if(head == null) {
            generateNode(valueOfNode);
            return;
        } else if(location == 0) {
            // new node should have reference to node that was earlier next to head
            node.nextReference = head;
            // head should have reference to new node
            head = node;
        } else if(location >= size) {
            // new node should have reference/link as null as it'll be inserted as tail
            node.nextReference = null;
            // last node should have reference to new node
            tail.nextReference = node;
            // tail should have reference to new node
            tail = node;
        } else {
            // declare a starting index
            int index = 0;
            // declare tempNode as head to begin with looping
            Node tempNode = head;
            // loop through linked list
            while (index < location-1) {
                tempNode = tempNode.nextReference;
                index++;
            }
            // get the reference to node which will be moving next to node being inserted
            Node nextNodeReference = tempNode.nextReference;
            // set the reference of node that will move before new node being inserted to the reference of new node
            tempNode.nextReference = node;
            // set the new node to reference the node that will come after it
            node.nextReference = nextNodeReference;
        }
        size++;
    }

    // Singly linked list traversal
    public void traverseSinglyLinkedList() {
        if(head == null) {
            System.out.println("Singly linked list does not exist");
        } else {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.nodeValue);
                if(i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.nextReference;
            }
        }
    }
}
