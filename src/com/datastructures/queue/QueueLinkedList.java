package com.datastructures.queue;

public class QueueLinkedList {
    SinglyLinkedList singlyLinkedList;

    public QueueLinkedList() {
        singlyLinkedList = new SinglyLinkedList();
        System.out.println("The Queue is successfully created");
    }

    // is empty
    public boolean isEmpty() {
        if(singlyLinkedList.head ==  null){
            return true;
        }
        else {
            return false;
        }
    }

    // enqueue
    public void enQueue(int value) {
        singlyLinkedList.insertNode(value, singlyLinkedList.size);
        System.out.println("Successfully inserted "+value+" in the queue");
    }

    // dequeue
    public int deQueue() {
        if (isEmpty()){
            return -1;
        }
        else {
            int result = singlyLinkedList.head.nodeValue;
            singlyLinkedList.deleteNode(0);
            return result;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()){
            return -1;
        }
        else {
            return singlyLinkedList.head.nodeValue;
        }
    }

    // delete
    public void deleteQueue() {
        singlyLinkedList.head = null;
        singlyLinkedList.tail = null;
        System.out.println("The Queue is successfully deleted");
    }
}
