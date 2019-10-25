package com.company.introduction_to_oop.tree;

public class BirchTree extends DeciduousTree {

    @Override
    public String toString() {
        return "Береза - " + this.hasLeaves();
    }
}
