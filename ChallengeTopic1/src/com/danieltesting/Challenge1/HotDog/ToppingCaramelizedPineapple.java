package com.danieltesting.Challenge1.HotDog;

public class ToppingCaramelizedPineapple extends ToppingDecorator{

    public ToppingCaramelizedPineapple(HotDog newHotDog) {
        super(newHotDog);
        System.out.println("Adding Pineapple ");
    }

    public String getDescription(){
        return tempHotDog.getDescription()+", Caramelized Pineapple";
    }

    public double getCost(){
        return tempHotDog.getCost()+.75;
    }

}
