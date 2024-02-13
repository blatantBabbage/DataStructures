package com.datastructures.queue;

import java.sql.Struct;

public class CircularQueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;
    public CircularQueueArray(int size){
        arr = new int[size];
        this.size = size;
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Circular Queue is created of size " + size);
    }

    // is empty
    public boolean isEmpty(){
        if(topOfQueue == -1 ){
            return true;
        } else {
            return false;
        }
    }

    // is full
    public boolean isFull(){
        if(topOfQueue+1 == beginningOfQueue){
            return true;
        }
        else if(topOfQueue == arr.length-1 && beginningOfQueue == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // enqueue
    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Circular Queue is full");
        }
        else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted value " + value);
        }
        else {
            if(topOfQueue == arr.length-1) {
                topOfQueue = 0;

            }
            else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("successfully inserted value " + value);
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
            // setting to 0 to mark the 1st position in queue; beginningOfQueue as unused many people also set this to
            // MIN_INTEGER_VALUE
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue == arr.length-1) {
                beginningOfQueue = 0;
            }
            else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    // peek
    public int peek() {
        if(isEmpty()) {
            System.out.println("Circular Queue is empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // delete
    public void delete() {
        arr=null;
        System.out.println("Queue is deleted");
    }
}
