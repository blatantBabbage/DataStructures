package com.datastructures.tree;

public class MainTree {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode tea = new TreeNode("tea");
        TreeNode beer = new TreeNode("beer");
        TreeNode coca_cola = new TreeNode("coca_cola");
        drinks.addChildren(hot);
        drinks.addChildren(cold);
        hot.addChildren(tea);
        hot.addChildren(coffee);
        cold.addChildren(beer);
        cold.addChildren(coca_cola);
        System.out.println(drinks.print(0));
    }
}
