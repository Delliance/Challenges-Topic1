package com.danieltesting.Challenge1.HotDog;

import java.text.NumberFormat;

public class HotDogMain {

    public static void hotDogMain(){

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("First order maxi special hot dog ");
//         here we are adding all the ingredients
        HotDog specialHotDog = new ToppingExtraSausage(
                new ToppingTomatoSauce(
                        new ToppingMustardSauce(
                                new ToppingPotatoChips(
                                        new ToppingOnion(
                                                new ToppingBacon(
                                                        new ToppingCaramelizedPineapple(
                                                                new PlainHotDog())))))));

        System.out.println("Here is your order: " + specialHotDog.getDescription());
        System.out.println("The total price is: " + formatter.format(specialHotDog.getCost()));

        System.out.println("\nSecond order simple Hawaiian hot dog with extra pineapple");

        HotDog hawaiianHotDog = new ToppingMustardSauce(
                new ToppingPotatoChips(
                        new ToppingCaramelizedPineapple(
                                new ToppingCaramelizedPineapple(
                                        new ToppingBacon(
                                                new PlainHotDog())))));

        System.out.println("Here is your order: " + hawaiianHotDog.getDescription());
        System.out.println("The total price is: " + formatter.format(hawaiianHotDog.getCost()));
    }

}
