package com.datastructures.linkedList.interviewQuestions;

public class IntersectionLists {
    public Node getKthNode(Node head, int k) {
        Node current = head;
        while(k!=0 && current !=null) {
            current = current.nextNodeRef;
            k--;
        }
        return current;
    }

    public Node findIntersection(LinkedList ll1, LinkedList ll2) {
        if(ll1.head == null || ll2.head == null ) {
            return null;
        }
        if (ll1.tail != ll2.tail) {
            return null;
        }
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
        while(shorter != longer) {
            shorter = shorter.nextNodeRef;
            longer = longer.nextNodeRef;
        }
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
