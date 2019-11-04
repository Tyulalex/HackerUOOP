package com.company.advanced_with_java.collections.atm.domain;

import java.util.Date;

public class Account {

    private final String holder;
    private final Date date;
    private final String number;

    public Account(String holder, Date date, String number) {
        this.holder = holder;
        this.date = date;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public Date getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }
}
