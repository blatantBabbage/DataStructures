package com.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryTreeNode root;
    public BinaryTreeLL() {
        this.root = null;
    }

    // pre order traversal
    public void preOrderTraversal(BinaryTreeNode binaryTreeNode) {
        if(binaryTreeNode == null) {
            return;
        }
        System.out.print(binaryTreeNode.value + "  ");
        preOrderTraversal(binaryTreeNode.leftChild);
        preOrderTraversal(binaryTreeNode.rightChild);
    }

    // in order traversal
    public void inOrderTraversal(BinaryTreeNode binaryTreeNode){
        if(binaryTreeNode == null) {
            return;
        }
        inOrderTraversal(binaryTreeNode.leftChild);
        System.out.print(binaryTreeNode.value + "  ");
        inOrderTraversal(binaryTreeNode.rightChild);
    }

    // post order traversal
    public void postOrderTraversal(BinaryTreeNode binaryTreeNode){
        if(binaryTreeNode == null) {
            return;
        }
        postOrderTraversal(binaryTreeNode.leftChild);
        postOrderTraversal(binaryTreeNode.rightChild);
        System.out.print(binaryTreeNode.value + "  ");
    }

    // Level order traversal (Breadth first search)
    public void levelOrderTraversal() {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTreeNode presentNode = queue.remove();
            System.out.print(presentNode.value + "  ");
            if(presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
        System.out.println("\n");
    }

    // search in Tree using level order traversal
    public void search(String value) {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTreeNode presentNode = queue.remove();
            if(presentNode.value == value) {
                System.out.println("\nThe value "+value+ " is found in Tree");
                return;
            }
            else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("Value does not exists in the Tree");
    }

    // insert new node in Binary Tree using level order traversal
    public void insert(String value) {
        BinaryTreeNode newNode = new BinaryTreeNode();
        newNode.value = value;
        if(root == null) {
            root = newNode;
            System.out.println("New node value inserted at root");
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode presentNode = queue.remove();
            if(presentNode.leftChild == null) {
                presentNode.leftChild = newNode;
                System.out.println("New node value inserted as left child");
                break;
            }
            else if(presentNode.rightChild == null) {
                presentNode.rightChild = newNode;
                System.out.println("New node value inserted as right child");
                break;
            }
            else {
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }
    }

    // Deleting a node from Binary tree will require below steps
    // Step 1 - Find the Node
    // Step 2 - Find Deepest Node
    // Step 3 - Set Deepest Node’s value to Current Node
    // Step 4 - Delete Deepest Node

    // method to find the deepest node
    BinaryTreeNode getDeepestNode() {
        Queue<BinaryTreeNode> queue =new LinkedList<BinaryTreeNode>();
        queue.add(root);
        BinaryTreeNode presentNode = null;
        while(!queue.isEmpty()) {
            presentNode = queue.remove();
            if(presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
        return presentNode;
    }

    // method to delete deepest node in binary tree
    public void deleteDeepestNode() {
        Queue<BinaryTreeNode> queue =new LinkedList<BinaryTreeNode>();
        queue.add(root);
        BinaryTreeNode prevNode, presentNode = null;
        while(!queue.isEmpty()) {
            prevNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.leftChild == null) {
                // means that previous right node was the deepest hence it should be set to null
                prevNode.rightChild = null;
                return;
            }else if (presentNode.rightChild == null) {
                // means that previous left node was the deepest hence it should be set to null
                presentNode.leftChild = null;
                return;
            }
            queue.add(presentNode.leftChild);
            queue.add(presentNode.rightChild);
        }
    }

    // delete a given node from binary tree
    public void deleteNode(String value) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode presentNode = queue.remove();
            if(presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("sucessfully deleted node " + value);
                return;
            }
            else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("Node " + value + " does not exists in the Binary tree");
    }

    // delete entire bt
    public void deleteBinaryTree(){
        root=null;
        System.out.println("Deleted Binary tree");
    }
}
