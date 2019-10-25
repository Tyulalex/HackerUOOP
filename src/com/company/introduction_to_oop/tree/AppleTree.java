package com.company.introduction_to_oop.tree;

public class AppleTree extends DeciduousTree {

    @Override
    public String toString() {
        return "Яблочное дерево - " + this.hasLeaves();
    }
}
