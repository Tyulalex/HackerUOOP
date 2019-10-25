package com.company.introduction_to_oop.hm2_additional_tasks.computer;

public class Monitor implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
