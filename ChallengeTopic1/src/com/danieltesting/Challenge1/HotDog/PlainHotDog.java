package com.danieltesting.Challenge1.HotDog;

public class PlainHotDog implements HotDog{
    @Override
    public String getDescription() {
        return "Hot Dog Bread, sausage";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
