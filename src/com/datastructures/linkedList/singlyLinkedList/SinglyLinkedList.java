package com.datastructures.linkedList.singlyLinkedList;

/*
This CreateSinglyLinkedList class does all the operation for the singly linked list as the following:
1. Declares head and tail.
2. Instantiate a node, assign value to node and set reference to null if the size of linked list is 1.
3. Assign the above created node to head and tail in order to generate a node link.
 */
public class SinglyLinkedList {
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
            System.out.println("");
        }
    }

    // search for a node
    boolean searchNode(int valueOfNode) {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.nodeValue == valueOfNode) {
                    System.out.println("Node found at index: " + i);
                    return true;
                }
                tempNode = tempNode.nextReference;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // Delete a node from singly linked list
    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("Linked list is not initialized");
            return;
        } else if(location == 0) {
            head = head.nextReference;
            size--;
            if(location == size-1) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i=0; i<size-1; i++) {
                tempNode = tempNode.nextReference;
            }
            if (tempNode == head) {
                head = tail = null;
                size--;
            }
            tempNode.nextReference = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i=0; i<location-1; i++) {
                tempNode = tempNode.nextReference;
            }
            tempNode.nextReference = tempNode.nextReference.nextReference;
            size--;
        }
    }

    // Delete entire singly linked list
    public void deleteSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("Singly Linked list deleted successfully");
    }
}
