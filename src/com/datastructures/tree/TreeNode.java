package com.datastructures.tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;
    public TreeNode(String data){
        this.data = data;
        children = new ArrayList<TreeNode>();
    }
    // add child to tree
    public void addChildren(TreeNode node) {
         children.add(node);
    }

    // print tree
    public String print(int level) {
        String result;
        result = "  ".repeat(level) + data +"\n";
        for(TreeNode node : this.children) {
            result += node.print(level+1);
        }
        return result;
    }
}
