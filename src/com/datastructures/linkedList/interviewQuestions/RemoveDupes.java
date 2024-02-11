package com.datastructures.linkedList.interviewQuestions;

import java.util.HashSet;

public class RemoveDupes {
    public void removeDupes(LinkedList linkedList) {
        HashSet hashSet = new HashSet<>();
        Node currentNode = linkedList.head;
        Node previousNode = null;
        while(currentNode != null) {
            if(hashSet.contains(currentNode.value)) {
                previousNode.nextNodeRef = currentNode.nextNodeRef;
                linkedList.size--;
            }
            else {
                hashSet.add(currentNode.value);
                previousNode = currentNode;
            }
            currentNode = currentNode.nextNodeRef;
        }
    }
}
