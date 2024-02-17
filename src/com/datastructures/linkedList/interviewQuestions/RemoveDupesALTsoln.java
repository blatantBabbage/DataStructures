package com.datastructures.linkedList.interviewQuestions;

// remove duplicate linked list eg: 1->2->3->2->1
public class RemoveDupesALTsoln {
    /* method to remove duplicates from a linked list
    params: LinkedList
     */
    public void removeDups(LinkedList ll) {
        Node current = ll.head;
        while(current.nextNodeRef != null) {
            Node runner = current;
            while (runner.nextNodeRef != null) {
                if(runner.nextNodeRef.value == current.value) {
                    runner.nextNodeRef = runner.nextNodeRef.nextNodeRef;
                    ll.size--;
                }
                else {
                    runner = runner.nextNodeRef;
                }
            }
            current = current.nextNodeRef;
        }
    }

}


