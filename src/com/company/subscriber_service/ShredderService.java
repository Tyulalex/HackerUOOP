package com.company.subscriber_service;

public class ShredderService {

    private Sheet[] sheets;

    public ShredderService(Sheet[] sheets) {
        this.sheets = sheets;
    }

    public Sheet[] getSheets() {
        return sheets;
    }

    public void setSheets(Sheet[] sheets) {
        this.sheets = sheets;
    }


    public void shredder() {
        System.out.println("Shredding" + this.sheets);
    }
}
