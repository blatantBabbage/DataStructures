package com.datastructures.linkedList.interviewQuestions;

public class MainALTsoln {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.traverseAlt();
        RemoveDupesALTsoln removeDupesALTsoln = new RemoveDupesALTsoln();
        removeDupesALTsoln.removeDups(ll);
        ll.traverseAlt();
    }
}
