package com.datastructures.queue;

public class MainCircularQueueArray {
    public static void main(String[] args) {
        CircularQueueArray circularQueueArray = new CircularQueueArray(4);
        boolean result = circularQueueArray.isEmpty();
        System.out.println(result);
        boolean result1 = circularQueueArray.isFull();
        System.out.println(result1);
        circularQueueArray.enQueue(1);
        circularQueueArray.enQueue(2);
        circularQueueArray.enQueue(3);
        circularQueueArray.enQueue(4);
        circularQueueArray.enQueue(4);
        int result3 = circularQueueArray.peek();
        System.out.println(result3);
        circularQueueArray.deQueue();
        circularQueueArray.deQueue();
        int result4 = circularQueueArray.peek();
        System.out.println(result4);
        circularQueueArray.delete();

    }
}
