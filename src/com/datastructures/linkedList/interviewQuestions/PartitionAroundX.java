package com.datastructures.linkedList.interviewQuestions;

public class PartitionAroundX {
    public void partition(LinkedList linkedList, int numberx) {
        Node lastSmallNode = null;
        Node current = linkedList.head;
        // to hold the most recent node reference
        Node prev = current;
        for(int i=0; i< linkedList.size; i++) {
            int num = current.value;
            if(num < numberx) {
                if (lastSmallNode != null) {
                    prev.nextNodeRef=current.nextNodeRef;
                    current.nextNodeRef = lastSmallNode;
                    linkedList.head = current;
                }
                lastSmallNode = current;
            } else {
                prev = current;
            }
            current = current.nextNodeRef;
        }
    }
}
