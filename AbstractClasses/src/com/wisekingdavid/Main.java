package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        //String stringData = "Croatia,Czech,Denmark,Austria,Belgium,Estonia,Finland,France,Cyprus,Germany";

        String stringData = "3, 2, 7, 1, 8, 5, 6, 9, 0, 4";
        for(String s: stringData.split(", ")){
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("7"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("0"));
        tree.traverse(tree.getRoot());

        tree.addItem(new Node("9"));
        tree.addItem(new Node("0"));
        tree.addItem(new Node("4"));
        tree.addItem(new Node("1"));
        tree.addItem(new Node("2"));
        tree.addItem(new Node("7"));
        tree.traverse(tree.getRoot());
    }
}
