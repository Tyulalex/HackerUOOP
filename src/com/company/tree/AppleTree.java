package com.company.tree;

public class AppleTree extends DeciduousTree {

    @Override
    public String toString() {
        return "Яблочное дерево - " + this.hasLeaves();
    }
}
