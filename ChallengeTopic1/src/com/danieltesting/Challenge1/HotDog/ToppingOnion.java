package com.danieltesting.Challenge1.HotDog;

public class ToppingOnion extends ToppingDecorator{

    public ToppingOnion(HotDog newHotDog) {
        super(newHotDog);
        System.out.println("Adding Onion ");
    }

    public String getDescription(){
        return tempHotDog.getDescription()+", Roasted Onion";
    }

    public double getCost(){
        return tempHotDog.getCost()+.25;
    }

}
