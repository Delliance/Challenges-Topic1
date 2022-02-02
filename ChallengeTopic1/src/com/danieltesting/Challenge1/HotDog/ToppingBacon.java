package com.danieltesting.Challenge1.HotDog;

public class ToppingBacon extends ToppingDecorator{

    public ToppingBacon(HotDog newHotDog) {
        super(newHotDog);
        System.out.println("Adding Bacon ");
    }

    public String getDescription(){
        return tempHotDog.getDescription()+", Crispy Bacon";
    }

    public double getCost(){
        return tempHotDog.getCost()+1.00;
    }

}
