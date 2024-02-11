package com.datastructures.linkedList.interviewQuestions;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLL(1);
        linkedList.insertNode(9);
        linkedList.insertNode(5);
        linkedList.insertNode(10);
        linkedList.insertNode(2);
        linkedList.insertNode(2);
        linkedList.traveseLL();
        RemoveDupes rmDupes = new RemoveDupes();
        rmDupes.removeDupes(linkedList);
        linkedList.traveseLL();
        ReturnNthToLastNode returnNthToLastNode = new ReturnNthToLastNode();
        returnNthToLastNode.nthNodetoLast(linkedList, 5);
        PartitionAroundX partitionAroundX = new PartitionAroundX();
        partitionAroundX.partition(linkedList, 4);
        linkedList.traveseLL();
    }
}
