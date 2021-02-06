package com.alinur.TreeApp;

public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(55,12);
        tree.insert(22,122);
        tree.insert(45,1);
        tree.insert(12,2);
        tree.insert(8,45);
        tree.insert(65,0.1);
        tree.insert(13,0.1);
        tree.insert(9,0.1);
        tree.inOrder(tree.root);
        System.out.println();
        tree.delete(8);
        tree.inOrder(tree.root);
    }
}
