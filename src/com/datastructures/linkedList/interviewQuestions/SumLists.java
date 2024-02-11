package com.datastructures.linkedList.interviewQuestions;

public class SumLists {
    public LinkedList result(LinkedList lla, LinkedList llb) {
        int carry = 0;
        Node currentA = lla.head;
        Node currentB = llb.head;
        LinkedList resultll = new LinkedList();
        while(currentA != null || currentB !=null) {
            int result = carry;
            if(currentA != null) {
                result += currentA.value;
                currentA = currentA.nextNodeRef;
            }
            if(currentB != null) {
                result += currentB.value;
                currentB = currentB.nextNodeRef;
            }
            resultll.insertNode(result%10);
            carry = result/10;
        }
        return resultll;
    }
}
