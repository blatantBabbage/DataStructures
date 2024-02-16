package com.datastructures.tree;

public class MainBinaryTreeArr {
    public static void main(String[] args) {
        BinaryTreeArray binaryTreeArray = new BinaryTreeArray(9);
        binaryTreeArray.insertNode("N1");
        binaryTreeArray.insertNode("N2");
        binaryTreeArray.insertNode("N3");
        binaryTreeArray.insertNode("N4");
        binaryTreeArray.insertNode("N5");
        binaryTreeArray.insertNode("N6");
        binaryTreeArray.insertNode("N7");
        binaryTreeArray.insertNode("N8");
        binaryTreeArray.insertNode("N9");
        binaryTreeArray.postOrderTraversal(1);
        binaryTreeArray.levelOrderTraversal();
        binaryTreeArray.search("N5");
        binaryTreeArray.delete("N7");
        binaryTreeArray.levelOrderTraversal();
    }



}
