package com.company.tree;

public class BirchTree extends DeciduousTree {

    @Override
    public String toString() {
        return "Береза - " + this.hasLeaves();
    }
}