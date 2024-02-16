package com.datastructures.tree;

public class BinaryTreeArray {
    String[] arr;
    int lastUsedIndex;
    public BinaryTreeArray(int size) {
        arr = new String[size+1];
        lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size +" is created");
    }

    // is full
    public boolean isFull() {
        if (arr.length-1 == lastUsedIndex) {
            return true;
        }
        else {
            return false;
        }
    }

    // insert node in binary array tree
    public void insertNode(String value) {
        if(!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("Inserted node " + value + " in Binary Tree Array");
        }
        else {
            System.out.println("Binary Tree Array is full");
        }
    }

    // pre order traversal
    public void preOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + "  ");
        preOrderTraversal(index*2);
        preOrderTraversal(index*2+1);
    }

    // in order traversal
    public void inOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrderTraversal(index*2);
        System.out.print(arr[index] + "  ");
        inOrderTraversal(index*2+1);
    }

    // post order traversal
    public void postOrderTraversal(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrderTraversal(index*2);
        postOrderTraversal(index*2+1);
        System.out.print(arr[index] + "  ");

    }

    // level order traversal
    public void levelOrderTraversal() {
        System.out.print("\n");
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public int search(String value) {
        System.out.print("\n");
        for (int i = 1; i <= lastUsedIndex; i++) {
            if(arr[i] == value) {
                System.out.print("Found element at index " + i);
                return i;
            }
        }
        System.out.print("value does not exist");
        return -1;
    }

    public void delete(String value) {
        // find deepest node
        int location = search(value);
        if(location == -1) {
            System.out.print("value does not exist");
            return;
        }
        else {
            // replace node to be deleted with deepest node
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.print("successfully deleted value");
        }
    }

    public void delete() {
        try {
            arr = null;
            System.out.print("successfully deleted array tree");
        }
        catch (Exception e) {
            System.out.print("error in deleting array tree ");
        }

    }
}
