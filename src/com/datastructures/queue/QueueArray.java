package com.datastructures.queue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Queue is created of size " + size);
    }

    // is full
    public boolean isFull() {
        if(topOfQueue == arr.length-1) {
            return true;
        }
        else {
            return false;
        }
    }

    // is empty
    public boolean isEmpty() {
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        }
        else {
            return false;
        }
    }

    // enqueue
    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value " + value);
        }
        else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value " + value);
        }
    }

    // dequeue
    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue) {
                beginningOfQueue =topOfQueue = -1;
            }
            return result;
        }
    }

    // peek
    public int peek() {
        if(!isEmpty()) {
            System.out.println("peek " + arr[beginningOfQueue]);
            return arr[beginningOfQueue];
        }
        System.out.println("Queue is empty");
        return -1;
    }

    // delete
    public void delete() {
        arr=null;
        System.out.println("Queue is deleted");
    }
}
