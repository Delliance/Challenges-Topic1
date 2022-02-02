package com.danieltesting.Challenge1.HotDog;

public class ToppingTomatoSauce extends ToppingDecorator{

    public ToppingTomatoSauce(HotDog newHotDog) {
        super(newHotDog);
        System.out.println("Adding Tomato Sauce ");
    }

    public String getDescription(){
        return tempHotDog.getDescription()+", Tomato Sauce";
    }

    public double getCost(){
        return tempHotDog.getCost()+.35;
    }

}
