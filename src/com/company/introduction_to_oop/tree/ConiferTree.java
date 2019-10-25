package com.company.introduction_to_oop.tree;

public abstract class ConiferTree implements Tree {
    @Override
    public boolean hasLeaves() {
        return false;
    }

    abstract boolean isGrownInRussia();
}
