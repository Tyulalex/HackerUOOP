package com.company.tree;

public class ChristmasTree extends ConiferTree {
    @Override
    boolean isGrownInRussia() {
        return true;
    }

    @Override
    public String toString() {
        return "ChristmasTree - " + this.hasLeaves();
    }
}
