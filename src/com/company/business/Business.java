package com.company.business;

public class Business implements Photostudio, KeyCutting {

    private String photoStudioName;

    public Business(String photoStudioName) {
        this.photoStudioName = photoStudioName;
    }

    @Override
    public String toString() {
        return "Business{" +
                "photoStudioName='" + photoStudioName + '\'' +
                '}';
    }

    @Override
    public void findKeyMaster() {
        System.out.println("ищу мастеров");
    }

    @Override
    public void addToYandexMap(Photostudio photostudio) {
        System.out.println("добавляю на яндекс карты");
        Yandex.addNewPhotoStudio(photostudio);
    }

    @Override
    public void getLicense() {
        System.out.println("получаю лицензию");
    }

    @Override
    public void makeSignboard() {
        System.out.println("делаю вывеску");
    }
}
