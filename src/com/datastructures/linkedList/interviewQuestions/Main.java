package com.datastructures.linkedList.interviewQuestions;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLL(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        linkedList.insertNode(2);
        linkedList.traveseLL();
        RemoveDupes rmDupes = new RemoveDupes();
        rmDupes.removeDupes(linkedList);
        linkedList.traveseLL();
    }
}
