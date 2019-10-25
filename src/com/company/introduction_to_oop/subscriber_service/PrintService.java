package com.company.introduction_to_oop.subscriber_service;

public class PrintService {

    public static Sheet[] printService(Object[] objects) {
        Sheet[] sheets = new Sheet[objects.length];
        for (int i = 0; i < objects.length; i++) {
            sheets[i] = new Sheet((String)objects[i]);
        }
        return sheets;
    }
}
