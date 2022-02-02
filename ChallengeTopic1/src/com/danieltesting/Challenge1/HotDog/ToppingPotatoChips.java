package com.danieltesting.Challenge1.HotDog;

public class ToppingPotatoChips extends ToppingDecorator{

    public ToppingPotatoChips(HotDog newHotDog) {
        super(newHotDog);
        System.out.println("Adding Potato Chips ");
    }

    public String getDescription(){
        return tempHotDog.getDescription()+", Potato Chips";
    }

    public double getCost(){
        return tempHotDog.getCost()+.75;
    }

}
