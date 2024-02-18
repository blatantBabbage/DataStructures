package com.datastructures.tree.avlTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;
    public AVLTree() {
        root = null;
    }

    // pre order traversal Root -> Left -> Right
    public void preOrderTraversal(BinaryNode node) {
        // break condition
        if(node == null) {
            return;
        }
        // recursive call
        System.out.print(node.nodeValue + "  ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    // in order traversal Left -> Root -> Right
    public void inOrderTraversal(BinaryNode node) {
        // break condition
        if(node == null) {
            return;
        }
        // recursive call
        inOrderTraversal(node.leftChild);
        System.out.print(node.nodeValue + "  ");
        inOrderTraversal(node.rightChild);
    }

    // post order traversal Left -> Right -> Root
    public void postOrderTraversal(BinaryNode node) {
        // break condition
        if(node == null) {
            return;
        }
        //recursive call
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
        System.out.print(node.nodeValue + "  ");
    }

    // level order traversal
    public void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.nodeValue + "  ");
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
    }

    // search node
    public BinaryNode search(BinaryNode node, int value) {
        if(node == null) {
            System.out.println("node value not found");
            return  null;
        }
        else if(node.nodeValue == value) {
            System.out.println("found node value " + value);
            return node;
        }
        else if (value < node.nodeValue) {
            System.out.println("found node value in left subtree " + value);
            return search(node.leftChild, value);
        }
        else {
            System.out.println("found node value in right subtree " + value);
            return search(node.rightChild, value);
        }
    }
}
