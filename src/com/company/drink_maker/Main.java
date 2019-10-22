package com.company.drink_maker;

public class Main {

    public static void main(String[] args) {
        DrinkMaker latteMaker = new DrinkMaker() {
            @Override
            public void getRightCup() {
                System.out.println("Выбрана подходящая кружка для Латте");
            }

            @Override
            public void putIngredient() {
                System.out.println("положены ингредиенты для Латте");
            }
        };
        DrinkMaker teaMaker = new DrinkMaker() {
            @Override
            public void getRightCup() {
                System.out.println("Выбрана подходящая кружка для Чая");
            }

            @Override
            public void putIngredient() {
                System.out.println("положены ингредиенты для чая");
            }
        };

        makeDrinks(new DrinkMaker[]{latteMaker, teaMaker});
    }


    public static void makeDrinks(DrinkMaker[] drinks) {
        for (DrinkMaker drink : drinks) {
            drink.giveACupToConsumer();
            drink.getRightCup();
            drink.putIngredient();
        }
    }


}
