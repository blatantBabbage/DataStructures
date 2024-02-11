package com.datastructures.linkedList.interviewQuestions;

public class ReturnNthToLastNode {
    public int nthNodetoLast(LinkedList linkedList, int location) {
        Node tempNode = linkedList.head;
        int index = linkedList.size - location;
        for(int i=0; i<index; i++) {
            tempNode = tempNode.nextNodeRef;
        }
        System.out.println("The " + location + " to last element of a singly linked list is " + tempNode.value);
        return tempNode.value;
    }
}
