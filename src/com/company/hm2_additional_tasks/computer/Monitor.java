package com.company.hm2_additional_tasks.computer;

public class Monitor implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
