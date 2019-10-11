package com.company.hm2_additional_tasks.computer;

public class Mouse implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
