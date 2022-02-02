package com.danieltesting.Challenge1.HotDog;

public class ToppingMustardSauce extends ToppingDecorator{

    public ToppingMustardSauce(HotDog newHotDog) {
        super(newHotDog);
        System.out.println("Adding Sauce ");
    }

    public String getDescription(){
        return tempHotDog.getDescription()+", Mustard Sauce";
    }

    public double getCost(){
        return tempHotDog.getCost()+.30;
    }

}
