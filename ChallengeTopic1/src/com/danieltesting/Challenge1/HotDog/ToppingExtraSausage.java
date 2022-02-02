package com.danieltesting.Challenge1.HotDog;

public class ToppingExtraSausage extends ToppingDecorator{

    public ToppingExtraSausage(HotDog newHotDog) {
        super(newHotDog);
        System.out.println("Adding Extra Sausage ");
    }

    public String getDescription(){
        return tempHotDog.getDescription()+", Extra Juice Sausage";
    }

    public double getCost(){
        return tempHotDog.getCost()+1.25;
    }

}
