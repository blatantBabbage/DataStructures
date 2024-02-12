package com.datastructures.stack;

public class StackArray {
    int[] arr;
    int topOfStack;

    public StackArray(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("Initialized Array Stack of size " + size);
    }

    public boolean isEmpty() {
        if( topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if( topOfStack == arr.length - 1) {
            return true;
        }
        return false;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full!!");
        }
        else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("Value is successfully inserted");
        }
    }

    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        else {
            int valueToPop = arr[topOfStack];
            topOfStack--;
            return valueToPop;
        }
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        else {
            int topStackValue = arr[topOfStack];
            return topStackValue;
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("Stack is deleted");
    }
}
