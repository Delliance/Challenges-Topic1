package com.danieltesting.Challenge1.HotDog;

public class ToppingDecorator implements HotDog{

    protected HotDog tempHotDog;

    public ToppingDecorator (HotDog newHotDog){

        tempHotDog = newHotDog;

    }

    public String getDescription() {
        return tempHotDog.getDescription();
    }

    public double getCost() {
        return tempHotDog.getCost();
    }
}
