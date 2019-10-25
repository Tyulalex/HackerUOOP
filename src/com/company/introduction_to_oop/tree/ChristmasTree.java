package com.company.introduction_to_oop.tree;

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
