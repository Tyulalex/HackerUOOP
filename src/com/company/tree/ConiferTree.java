package com.company.tree;

public abstract class ConiferTree implements Tree {
    @Override
    public boolean hasLeaves() {
        return false;
    }

    abstract boolean isGrownInRussia();
}
