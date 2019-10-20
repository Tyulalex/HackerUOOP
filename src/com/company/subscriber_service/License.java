package com.company.subscriber_service;

public class License {

    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    Sheet[] printLicense(License[] licenses) {
        Sheet[] sheets = new Sheet[licenses.length];
        for (int i = 0; i < licenses.length; i++) {
            sheets[i] = new Sheet(licenses[i].getText());
        }
        return sheets;
    }

    void printAndShredderLicense(License[] licenses) {
        Sheet[] sheets = printLicense(licenses);
        new ShredderService(sheets).shredder();
    }
}
