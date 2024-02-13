package com.datastructures.tree;

public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
        BinaryTreeNode N1 = new BinaryTreeNode();
        N1.value = "N1";
        BinaryTreeNode N2 = new BinaryTreeNode();
        N2.value = "N2";
        BinaryTreeNode N3 = new BinaryTreeNode();
        N3.value = "N3";
        BinaryTreeNode N4 = new BinaryTreeNode();
        N4.value = "N4";
        BinaryTreeNode N5 = new BinaryTreeNode();
        N5.value = "N5";
        BinaryTreeNode N6 = new BinaryTreeNode();
        N6.value = "N6";
        BinaryTreeNode N7 = new BinaryTreeNode();
        N7.value = "N7";
        BinaryTreeNode N8 = new BinaryTreeNode();
        N8.value = "N8";
        BinaryTreeNode N9 = new BinaryTreeNode();
        N9.value = "N9";

        binaryTreeLL.root = N1;
        N1.leftChild = N2;
        N2.leftChild = N4;
        N4.leftChild = N8;
        N3.leftChild = N6;
        N1.rightChild = N3;
        N2.rightChild = N5;
        N4.rightChild = N9;
        N3.rightChild = N7;

//        binaryTreeLL.postOrderTraversal(N1);
        binaryTreeLL.levelOrderTraversal();
        binaryTreeLL.search("N9");
        binaryTreeLL.insert("N10");
        binaryTreeLL.insert("N11");
        binaryTreeLL.insert("N12");
        binaryTreeLL.levelOrderTraversal();
        System.out.println("\n Deepest node " + binaryTreeLL.getDeepestNode().value);
        binaryTreeLL.deleteDeepestNode();
        System.out.println("\n Deepest node " + binaryTreeLL.getDeepestNode().value);
        binaryTreeLL.levelOrderTraversal();
        binaryTreeLL.deleteNode("N4");
        binaryTreeLL.levelOrderTraversal();
        binaryTreeLL.deleteNode("N72");
        binaryTreeLL.levelOrderTraversal();
    }
}
