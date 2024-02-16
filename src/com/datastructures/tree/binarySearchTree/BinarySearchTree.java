package com.datastructures.tree.binarySearchTree;

public class BinarySearchTree {
    BinarySearchNode root;
    public BinarySearchTree() {
        root = null;
    }

    // Insert Method using recursion
    public BinarySearchNode insertNode(BinarySearchNode currentNode, int value) {
        if(currentNode == null) {
            BinarySearchNode newNode = new BinarySearchNode();
            newNode.nodeValue = value;
            System.out.println("Inserted node successfully");
            return newNode;
        } else if (value <= currentNode.nodeValue) {
            currentNode.leftChild = insertNode(currentNode.leftChild, value);
            return currentNode;
        }
        else {
            currentNode.rightChild = insertNode(currentNode.rightChild, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }
    // PreOrder Traversal
    // inOrder Traversal
    // PostOrder Traversal
    // Search
    // Delete node
    // Delete BST

}
