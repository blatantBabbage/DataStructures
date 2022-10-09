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
            // older node at the end needs to point at newly inserted node at the end
            tail.nodeReference = node;
            // tail should point to new node inserted at the end
            tail = node;
            // newly inserted node points at the end needs to point to node at beginning whose reference is stored in head
            node.nodeReference = head;
        } else {
            // creating a temp node and assigning head reference to it, so that we can loop from the beginning
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.nodeReference;
                index++;
            }
            // pointing the newly inserted node to the next node by taking its reference from current node
            node.nodeReference = tempNode.nodeReference;
            // updating current node to point to newly inserted node
            tempNode.nodeReference = node;
        }
        // increment the size of linked list, everytime insertion operation is performed
        size++;
    }

    /* Circular singly linked list traversal */
    public void traverseCircularSinglyLinkedList() {
        Node tempNode = head;
        if(head != null) {
            for (int i = 0; i<size; i++) {
                System.out.print(tempNode.nodeValue);
                if(i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.nodeReference;
            }
            System.out.println("");
        } else {
            System.out.println("\n Circular singly linked list does not exist!");
        }
    }

    /* Searching circular singly linked list */
    public boolean searchNode(int valueOfNode) {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.nodeValue == valueOfNode) {
                    /* we're mentioning location instead of mentioning index, coz we're looping on size and as size
                    basically starts with 1, we can also call it as location */
                    System.out.println("\nNode is found at location : " + i);
                    return true;
                }
                tempNode = tempNode.nodeReference;
            }
        }
        System.out.println("\nNode not found");
        return false;
    }

    /* Delete a node in circular singly linked list */
    public void deleteNode(int index) {
        if(head == null) {
            System.out.println("Circular singly linked list doesn't exist !!");
            return;
        } else if (index == 0) {
            /* to delete node from the beginning */
            // to check if list only has one node
            if(size == 1) {
                head = null;
                tail = null;
                head.nodeReference = null;
                size--;
            }
            head = head.nodeReference;
            tail.nodeReference = head;
            size--;
        } else if (index >= size-1) {
            /* to delete node from the end of the list */

            // tempNode is assigned with head to loop from beginning
            Node tempNode = head;
            // we're only running till 'size-2' as we want to stop at the second last node and then update its reference
            for(int i=0; i<size-1; i++) {
                tempNode = tempNode.nodeReference;
            }
            /* this will be true when the list has only one node, also its implies that the above loop wouldn't execute
            and tempNode will remain assigned with head value */
            if(tempNode == head) {
                head.nodeReference = null;
                head = null;
                tail = null;
                size--;
            }
            // pointing the 2nd last node to head
            tempNode.nodeReference = head;
            // pointing tail to the 2nd-last node
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            /* looping till 'index-1' as we want to stop at a node before the node we want to delete; where tempNode has
            reference to the node we want to delete */
            for(int i=0; i<index-1; i++) {
                tempNode = tempNode.nodeReference;
            }
            /* assigning node reference of node before the node we want to delete as the reference of node after the
            node we want to delete */
            tempNode.nodeReference = tempNode.nodeReference.nodeReference;
            size--;
        }
    }
}
