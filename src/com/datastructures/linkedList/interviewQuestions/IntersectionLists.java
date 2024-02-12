package com.datastructures.linkedList.interviewQuestions;

public class IntersectionLists {

    // We are writing this method to get the node from which we would need to start looping incase of longer loop,
    // once we know this node we will be able to loop through both long and short ll using a single loop

    public Node getKthNode(Node head, int k) {
        Node current = head;
        while(k!=0 && current !=null) {
            current = current.nextNodeRef;
            k--;
        }
        return current;
    }

    public Node findIntersection(LinkedList ll1, LinkedList ll2) {
        // if head is null it means ll doesn't exist
        if(ll1.head == null || ll2.head == null ) {
            return null;
        }
        // for intersecting ll tail needs to be same, if not then its not an intersecting ll
        if (ll1.tail != ll2.tail) {
            return null;
        }
        // this portion of code will tell us which ll is longer, so that we can call get kth method on it inorder to
        // obtain a node to start looping on both ll together for further operations
        Node longer = new Node();
        Node shorter = new Node();
        if(ll1.size > ll2.size) {
            longer = ll1.head;
            shorter =ll2.head;
        }
        else {
            longer = ll2.head;
            shorter =ll1.head;
        }
        longer = getKthNode(longer, Math.abs(ll1.size- ll2.size));
        // At the moment of intersection both short and long ref will be equal hence the loop will break at the
        // common reference
        while(shorter != longer) {
            shorter = shorter.nextNodeRef;
            longer = longer.nextNodeRef;
        }
        // we can return either as at this moment both will be same reference
        return shorter;
    }

    public void addSameNode(LinkedList ll1, LinkedList ll2, int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;
        ll1.tail.nextNodeRef = newNode;
        ll1.tail = newNode;
        ll2.tail.nextNodeRef =newNode;
        ll2.tail = newNode;
    }
}
