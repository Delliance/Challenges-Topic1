package com.danieltesting.Challenge1.OnlineShop;

import java.util.ArrayList;

public class ProductOne implements Product {

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        observers.remove(deleteObserver);
    }

    @Override
    public void notifyObserver(Message m) {
        for (Observer observer : observers) {
            observer.update(m);
            System.out.println(" for product 1");
        }
    }

}
