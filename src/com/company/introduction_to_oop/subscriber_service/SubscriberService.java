package com.company.introduction_to_oop.subscriber_service;

public class SubscriberService {
    public static String[] allSubscribers =
            {"andrey@ya.ru", "kolya@ya.ru", "petr@ya.ru"};

    public static void sendMail(String subscriber) {
        System.out.println("Sending - " + subscriber);
        System.out.println("Sending - " + subscriber);
    }

    public static void sendMailToAllSubscribers() {
        for (String subscriber : allSubscribers) {
            System.out.println("Sending - " + subscriber);
        }
    }

    public static String[] getAllSubscribers() {
        System.out.println();
        return allSubscribers;
    }

    public static Sheet[] printAllSubscribers() {
        return PrintService.printService(allSubscribers);
    }

    public static void stampAndSendToShredder() {
        Sheet[] sheets = printAllSubscribers();
        System.out.println("Stamp" + sheets);
        new ShredderService(sheets).shredder();
    }

    Sheet[] sendAndPrintAllSubcribers() {
        sendMailToAllSubscribers();
        return printAllSubscribers();
    }
}
