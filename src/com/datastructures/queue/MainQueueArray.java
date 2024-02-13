package com.datastructures.queue;

public class MainQueueArray {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);
        boolean result = queueArray.isEmpty();
        System.out.println(result);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        queueArray.enQueue(4);
        queueArray.enQueue(5);
        boolean result2 = queueArray.isFull();
        System.out.println(result2);
        queueArray.peek();
        int result3 = queueArray.deQueue();
        System.out.println(result3);
        queueArray.peek();
        queueArray.delete();
    }
}
