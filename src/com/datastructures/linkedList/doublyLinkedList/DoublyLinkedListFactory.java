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
        } else if (location >= size) {
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

    /* Delete a node in doubly linked list */
    public void deleteNode(int index) {
        if(head == null) {
            System.out.println("Doubly linked list does not exist !!");
            return;
        } else if (index == 0) {
            /* deleting node from beginning of list */

            // checking if list has only one node
            if(size == 1) {
                head = null;
                tail = null;
                size--;
            }

            // below execution is used when list has more than one node
            // setting null reference for previous node reference of 2nd node, which will become 1st node post deletion
            head.nextNode.prevNode = null;
            head = head.nextNode;
            size--;
        } else if (index >= size-1) {
            /* deleting node from end of list */

            // checking if list has only one node
            if(size == 1) {
                head = null;
                tail = null;
                size--;
            }

            // below execution is used when list has more than one node
            tail.prevNode.nextNode = null;
            tail = tail.prevNode;
            size--;
        } else {
            /* deleting node from a specific index in list */

            DoublyNode doublyNode = head;
            int location = 0;
            while(location<index-1) {
                doublyNode = doublyNode.nextNode;
                location++;
            }
            /* assigning next node reference of current node with node reference of the node next/after the node to be deleted */
            doublyNode.nextNode = doublyNode.nextNode.nextNode;
            /* assigning previous node reference of the node after the node to be deleted with the reference of node
            before the node to be deleted */
            doublyNode.nextNode.prevNode = doublyNode;
            size--;
        }
    }

    /* Delete complete circular singly linked list */
    public void deleteDoublyLinkedList() {
        if(head != null) {
            DoublyNode doublyNode = head;
            for(int i=0; i<size; i++) {
                doublyNode.prevNode = null;
                doublyNode = doublyNode.nextNode;
            }
            head = null;
            tail = null;
            size = 0;
            System.out.println("Doubly linked list is deleted, and current size is : " + size);
            return;
        }
        System.out.println("Doubly linked list does not exist !!");
    }
}
