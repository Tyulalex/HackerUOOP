package com.company.tree;

public class ChristmasTree extends ConiferTree {
    @Override
    boolean isGrownInRussia() {
        return true;
    }

    @Override
    public String toString() {
        return "Рождественское дерево - " + this.hasLeaves();
    }
}
