package com.company.introduction_to_oop.hm2_additional_tasks.computer;

public class Mouse implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
