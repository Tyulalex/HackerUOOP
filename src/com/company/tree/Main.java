package com.company.tree;

public class Main {

    public static void main(String[] args) {
        Tree[] trees = {new AppleTree(), new ChristmasTree(), new BirchTree()};
        for (Tree tree : trees) {
            System.out.println(tree.toString());
        }
        ConiferTree[] coniferTrees = {new ChristmasTree()};
        DeciduousTree[] deciduousTree = {new AppleTree(), new BirchTree()};
        Tree[][] treess = {coniferTrees, deciduousTree};
        for (Tree[] trees1 : treess) {
            for (Tree t : trees1) {
                System.out.println(t.toString());
            }
        }
    }
}
